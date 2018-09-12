package Conec;
//


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.sql.rowset.WebRowSet;

import cliente.Cliente;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import servidor.ContaCorrente;
import servidor.Investimento;



public class conecDAO {
	// a conexao com o banco de dados
	private Connection connection;  
	public conecDAO() throws ClassNotFoundException  {
		this.connection = new conexao().getConnection();
	}
//função que passa a string para o cliente passa pro servidor
	

public void criarConta(ContaCorrente conta) {
	
		String sql = "insert into conta " +
		"(nomeCli,cpfCli,endCli,nascCli,telefoneCli,senhaCli,saldoCc,saldoPou)" +
		" values (?,?,?,?,?,?,?,?)";
		
		try {
		// prepared statement para inserção
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		// seta os valores
		stmt.setString(1,conta.getNomeCli());
		stmt.setString(2,conta.getCpfCli());
		stmt.setString(3,conta.getEnderecoCli());
		stmt.setString(4,conta.getNascimentoCli());
		stmt.setString(5,conta.getTelefoneCli());
		stmt.setString(6,conta.getSenhaCli());
		stmt.setString(7,Double.toString(conta.getSaldoCorrente()));
		stmt.setString(8,Double.toString(conta.getSaldoPoupanca()));
		
		//stmt.setString(2,produto.getID());
		// executa
		stmt.execute();
		stmt.close();
		System.out.println("Inserido com sucesso");
		} catch (SQLException e) {
		      throw new RuntimeException(e);
		 }
}

public void saque(String contalogada, Double valor, String tipo) throws SQLException {
	Double saldoatual = 0.00; 
	Double saldonovo = 0.00;
	//faz primeiramente uma consulta no banco do valor
	List<ContaCorrente> c = new ArrayList<ContaCorrente>();
	PreparedStatement stmt = this.connection.prepareStatement("select * from conta where cpfCli ='" +contalogada + "'");
	ResultSet rs = stmt.executeQuery();
	//so vira um registro, mesmo assim ehnecessario varrer o array
	while (rs.next()) {
		if (tipo == "corrente") {
			saldoatual = rs.getDouble("saldoCc");	
		}else if (tipo == "poupanca") {
			saldoatual = rs.getDouble("saldoPou");
		}else if (tipo == "renda") {
			saldoatual = rs.getDouble("saldoRf");
		}	
	}
	
	//imprimindo valor atual
	System.out.println("VALOR ATUAL NA CONTA: " + Double.toString(saldoatual));
	
	if (saldoatual >= valor) {
		saldonovo = saldoatual - valor;
	}else {
		System.out.println("Valor inferior ao que contem na Conta");
	}
	
	//imprimindo novo valor 
		System.out.println("VALOR NOVO NA CONTA: " + Double.toString(saldonovo));
	
	//faz update com novo valor
	String sql = "";
	if (tipo == "corrente") {
		sql = "update conta set saldoCc = ? where cpfCli = ?";	
	}else if (tipo == "poupanca") {
		sql = "update conta set saldoPou = ? where cpfCli = ?";
	}else if (tipo == "renda") {
		sql = "update conta set saldoRf = ? where cpfCli = ?";
	}
	
	try {
		// prepared statement para inserção
		PreparedStatement stmt1 = connection.prepareStatement(sql);
		
		// seta os valores
		stmt1.setString(1,Double.toString(saldonovo));
		stmt1.setString(2,contalogada);
		// executa
		stmt1.execute();
		stmt1.close();
		System.out.println("Saque feito com sucesso!");
	} catch (SQLException e) {
	      throw new RuntimeException(e);
	 }
	
}


public void deposito(String contalogada, Double valor, String tipo) throws SQLException {
	Double saldoatual = 0.00; 
	Double saldonovo = 0.00;
	
	List<ContaCorrente> c = new ArrayList<ContaCorrente>();
	PreparedStatement stmt = this.connection.prepareStatement("select * from conta where cpfCli = '" +contalogada+ "'");
	ResultSet rs = stmt.executeQuery();
	
	while (rs.next()) {
		if (tipo == "corrente") {
			saldoatual = rs.getDouble("saldoCc");	
		}else if (tipo == "poupanca") {
			saldoatual = rs.getDouble("saldoPou");
		}else if (tipo == "renda") {
			saldoatual = rs.getDouble("saldoRf");
		}
	}
	
	saldonovo = saldoatual + valor;
	
	String sql = "";
	if (tipo == "corrente") {
		sql = "update conta set saldoCc = ? where cpfCli = ?";	
	}else if (tipo == "poupanca") {
		sql = "update conta set saldoPou = ? where cpfCli = ?";
	}else if (tipo == "renda") {
		sql = "update conta set saldoRf = ? where cpfCli = ?";
	}else {
		
	}
			
	try {
		// prepared statement para inserção
		PreparedStatement stmt1 = connection.prepareStatement(sql);
		
		// seta os valores
		stmt1.setString(1,Double.toString(saldonovo));
		stmt1.setString(2,contalogada);
		// executa
		stmt1.execute();
		stmt1.close();
		System.out.println("Deposito feito com sucesso!");
	} catch (SQLException e) {
	      throw new RuntimeException(e);
	 }
	
	
}

public double saldo(String contalogada, String tipo) throws SQLException {
	Double saldoatual = 0.00; 
	
	List<ContaCorrente> c = new ArrayList<ContaCorrente>();
	PreparedStatement stmt = this.connection.prepareStatement("select * from conta where cpfCli =" +contalogada);
	ResultSet rs = stmt.executeQuery();
	while (rs.next()) {
	     if (tipo == "corrente") {
			saldoatual = rs.getDouble("saldoCc");	
		}else if (tipo == "poupanca") {
			saldoatual = rs.getDouble("saldoPou");
		}else if (tipo == "renda") {
			saldoatual = rs.getDouble("saldoRf");
		}
	}
	
	
	return saldoatual;
}

public void remove(String id) {
	try {
		PreparedStatement stmt = connection.prepareStatement("delete from conta where ID=?");
		stmt.setString(1, id);
		stmt.execute();
		stmt.close();
		} catch (SQLException e) {
			System.err.println("ERRO" + e.getMessage());
			throw new RuntimeException(e);
		}
	}

public void transferencia(String contaLogada, String tipoContaRemetente, String  contaReceptora , String tipoContaReceptora , double valorTransferido) throws ClassNotFoundException{
	try {
		conecDAO c = new conecDAO();
		if (c.saldo(contaLogada,tipoContaRemetente)>valorTransferido) {
		c.saque(contaLogada, valorTransferido, tipoContaRemetente);
		c.deposito(contaReceptora, valorTransferido, tipoContaReceptora);
		System.out.println("TRANSFERIDO");
		} else {
			System.out.println("IMPOSSIVEL REALIZAR TRANSFERENCIA SALDO INSUFICIENTE");
		}
	}catch (SQLException e) {
		System.err.println("ERRO" + e.getMessage());
		throw new RuntimeException(e);
		}
	}

public double rendimento(String contaLogada, String tipoConta, int tempo) throws SQLException, ClassNotFoundException {
	conecDAO c = new conecDAO();
	double rendimento =0.00;
	rendimento=c.saldo(contaLogada, tipoConta);
	for(int i = 0; i <tempo;i++) {
			if(tipoConta == "poupanca") {
				rendimento= rendimento * 1.005;
			}else if(tipoConta == "renda") {
				rendimento = rendimento * 1.015; 
			}
		}
	return rendimento;
	}


public String logar(String conta, String senha) throws SQLException, ClassNotFoundException {
	System.out.println("COMPARANDO SENHA");
	String senhadobanco = " ";
	
	List<ContaCorrente> c = new ArrayList<ContaCorrente>();
	PreparedStatement stmt = this.connection.prepareStatement("select * from conta where cpfCli ='" +conta + "'");
	ResultSet rs = stmt.executeQuery();
	while (rs.next()) {
	  senhadobanco = rs.getString("senhaCli");
	}
	
	if (senhadobanco.equalsIgnoreCase(senha) ) {
		rs.close();
	    stmt.close();
	    System.out.println("SENHAS COINCIDEM");
		return conta; 
	}else {
		System.out.println("SENHAS NÃO COINCIDEM");
		rs.close();
	    stmt.close();
		return " ";
	}
	
}
	
}


