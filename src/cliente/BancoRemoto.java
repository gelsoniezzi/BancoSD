package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

import cliente.ClienteInterface;

public interface BancoRemoto extends Remote {
		
		// método a ser implementado
	    /*int somar(int a, int b) throws RemoteException;*/
	    
	    double saque(int cpfCli, double valorSaque, int tipo) throws RemoteException;
	    double deposito(int cpfCli, double valorDeposito, int tipo) throws RemoteException;
	    double transferencia(int cpfCli, int cpfDestinatario, double valorTransferencia,int tipoRemetente , int tipoDestino) throws RemoteException;
	    boolean criarConta(String nome, int cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP) throws RemoteException;
	    boolean criarRendaFixa() throws RemoteException;
	    

}
