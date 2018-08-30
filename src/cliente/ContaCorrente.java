package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.Scanner;


public class ContaCorrente {
	
	public String nomeCli;
	private int cpfCli;
	private String enderecoCli;
	private Date nascimentoCli;
	private String telefoneCli;
	private String senhaCli;
	private double saldoCorrente;
	private double saldoPoupanca;
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
		return saldoPoupanca;
	}


	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}


	public double getSaldoRendaFixa() {
		return saldoRendaFixa;
	}


	public void setSaldoRendaFixa(double saldoRendaFixa) {
		this.saldoRendaFixa = saldoRendaFixa;
	}

	private double saldoRendaFixa;

	public ContaCorrente() {
		// Construtor
	}


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
	
	public void setSenhaCli(double saldoCli) {
		this.saldoCli = saldoCli;
	}
	

}
