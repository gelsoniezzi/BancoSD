package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

import cliente.ClienteInterface;

public interface BancoRemoto extends Remote {
		
		// método a ser implementado
	    /*int somar(int a, int b) throws RemoteException;*/
    	public String criarConta(String nome, int cpf, String nascimento, String endereco, String telefone, String senha, double saldoCorrente, double saldoPoupanca, double saldoRendaFixa) throws RemoteException;
    
    
	    double saque(int cpfCli, double valorSaque, int tipo) throws RemoteException;
	    double deposito(int cpfCli, double valorDeposito, int tipo) throws RemoteException;
	    double transferencia(int cpfCli, int cpfDestinatario, double valorTransferencia,int tipoRemetente , int tipoDestino) throws RemoteException;

	    boolean criarRendaFixa() throws RemoteException;
	    

}
