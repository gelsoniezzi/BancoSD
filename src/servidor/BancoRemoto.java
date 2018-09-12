package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

import cliente.ClienteInterface;

public interface BancoRemoto extends Remote {
		
		// método a ser implementado
	    /*int somar(int a, int b) throws RemoteException;*/
	    
	    
	    //double transferencia(int cpfCli, int cpfDestinatario, double valorTransferencia,int tipoRemetente , int tipoDestino) throws RemoteException;
	    void criarConta(String nome, String cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP) throws RemoteException;
	    boolean criarRendaFixa() throws RemoteException;
		
		double deposito(String contalogada, Double valor, String tipo) throws RemoteException, ClassNotFoundException;
		void saque(String contalogada, double valorSaque, String tipo) throws RemoteException, ClassNotFoundException;
		
		double saldo(String contalogada, String tipo) throws RemoteException;
		void transferencia(String cpfCli, String tipoconta, String cpfDestinatario, String tipoconta2,double valorTransferencia) throws RemoteException;
		Double rendimento(String contaLogada, String tipoConta, int tempo) throws RemoteException;		
		public String logar(String conta, String senha) throws RemoteException, ClassNotFoundException, SQLException;	
		
}
