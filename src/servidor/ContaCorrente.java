package servidor;

/*
 * Classe que 
 * 
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;
import java.util.Scanner;


public class ContaCorrente {
	
	private String nomeCli;
	private int cpfCli;
	private int numeroConta;
	private String enderecoCli;
	private String nascimentoCli;
	private String telefoneCli;
	private String senhaCli;
	private double saldoCorrente;
	private double saldoPoupanca;
	private double saldoRendaFixa;
	private Investimento invest[];
	//private double saldoRendaFixa;
	//private double saldoPoupanca;

	
	public ContaCorrente(String nome, int cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP, double saldoR) {
		// Construtor
		setNomeCli(nome);
		setCpfCli(cpf);
		setEnderecoCli(end);
		setNascimentoCli(nascimento);
		setTelefoneCli(tel);
		setSenhaCli(senha);
		setSaldoCorrente(0.0);
		setSaldoPoupanca(0.0);
		setSaldoRendaFixa(0.0);
		
		System.out.println("Conta criada com sucesso.");
		System.out.println("cpf: " + cpf);
        //System.out.println("Número da conta: " + numeroConta); O numero da conta vai ser o numero do cliete.
		
	}
	
	public int getCpfCli() {
		return cpfCli;
	}


	public void setCpfCli(int cpfCli) {
		this.cpfCli = cpfCli;
	}


	public double getSaldoCorrente() {
		
		System.out.println("Conta CPF: " + cpfCli + " saldo: " + this.saldoCorrente); //recuperar saldo no banco de dados e depois fazer operacao
        System.out.println("---------------------------------------------");
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


	public double getSaldoRendaFixa() {
		return saldoRendaFixa;
	}

	public void setSaldoRendaFixa(double saldoRendaFixa) {
		this.saldoRendaFixa = saldoRendaFixa;
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


	public String getNascimentoCli() {
		return nascimentoCli;
	}


	public void setNascimentoCli(String nascimentoCli) {
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
	
	public void fazerDeposito(double valor) {
	    
        this.saldoCorrente += valor;
        System.out.println("Conta CPF: " + this.cpfCli + " valor deposito: " + valor + " Saldo atual :"+ this.saldoCorrente);
        System.out.println("---------------------------------------------");
    }
    
    public synchronized void fazerSaque(double valor) {
    if(saldoCorrente>valor) {
        this.saldoCorrente -= valor;
        System.out.println("Conta CPF: " + this.cpfCli + " valor sacado: " + valor);
        System.out.println("---------------------------------------------");
    }else {
    	System.out.println("Conta CPF: " + this.cpfCli + " saldo indisponivel.");
    }
	
    }
}
