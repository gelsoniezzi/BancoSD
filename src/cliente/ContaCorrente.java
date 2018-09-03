package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.Scanner;


public class ContaCorrente {
	
	private String nomeCli;
	private int cpfCli;
	private String enderecoCli;
	private Date nascimentoCli;
	private String telefoneCli;
	private String senhaCli;
	private double saldoCorrente;
	private Investimento invest[];
	//private double saldoRendaFixa;
	//private double saldoPoupanca;

	
	public ContaCorrente(String nome, int cpf, String end, Date nascimento, String tel, String senha, double saldoC, double saldoP) {
		// Construtor
		setNomeCli(nome);
		setCpfCli(cpf);
		setEnderecoCli(end);
		setNascimentoCli(nascimento);
		setTelefoneCli(tel);
		setSenhaCli(senha);
		setSaldoCorrente(saldoC);
		setSaldoPoupanca(saldoP);
		
	}
	
	public int getCpfCli() {
		return cpfCli;
	}


	public void setCpfCli(int cpfCli) {
		this.cpfCli = cpfCli;
	}


	public double getSaldoCorrente() {
		return saldoCorrente;
	}


	public void setSaldoCorrente(double saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}


	public double getSaldoPoupanca() {
			return invest[0].getSaldo();
	}


	public void setSaldoPoupanca(double saldoPoupanca) {
		//this.saldoPoupanca = saldoPoupanca;
		invest[0]= new Investimento(saldoPoupanca,1);
	}

//
//	public double getSaldoRendaFixa() {
//		return saldoRendaFixa;
//	}
//
//
//	public void setSaldoRendaFixa(double saldoRendaFixa) {
//		this.saldoRendaFixa = saldoRendaFixa;
//	}

	public String getNomeCli() {
		return nomeCli;
	}


	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}


	public String getEnderecoCli() {
		return enderecoCli;
	}


	public void setEnderecoCli(String enderecoCli) {
		this.enderecoCli = enderecoCli;
	}


	public Date getNascimentoCli() {
		return nascimentoCli;
	}


	public void setNascimentoCli(Date nascimentoCli) {
		this.nascimentoCli = nascimentoCli;
	}


	public String getTelefoneCli() {
		return telefoneCli;
	}


	public void setTelefoneCli(String telefoneCli) {
		this.telefoneCli = telefoneCli;
	}


	public String getSenhaCli() {
		return senhaCli;
	}


	public void setSenhaCli(String senhaCli) {
		this.senhaCli = senhaCli;
	}
	
	//public void setSenhaCli(double saldoCli) {
	//	this.saldoCli = saldoCli;
	//}
	

}
