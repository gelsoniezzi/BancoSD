package Conec;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import cliente.Cliente;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import servidor.ContaCorrente;
import servidor.Investimento;



public class conecDAO {
	// a conex√£o com o banco de dados
	private Connection connection;  
	public conecDAO() throws ClassNotFoundException {
		this.connection = new conexao().getConnection();
	}
//funÁ„o que passa a string para o cliente passa pro servidor
	

public void criarConta(ContaCorrente conta) {
	
		String sql = "insert into conta " +
		"(nomeCli,cpfCli,endCli,nascCli,telefoneCli,senhaCli,saldoCc,saldoPou)" +
		" values (?,?,?,?,?,?,?,?)";
	
		
		try {
		// prepared statement para inser√ß√£o
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		// seta os valores
		stmt.setString(1,conta.getNomeCli());
		stmt.setString(2,Integer.toString(conta.getCpfCli()));
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
		
		} catch (SQLException e) {
		      throw new RuntimeException(e);
		 }
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
	
	
}
