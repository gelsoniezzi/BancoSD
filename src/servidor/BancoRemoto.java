package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoRemoto extends Remote {
		
		// método a ser implementado
	    /*int somar(int a, int b) throws RemoteException;*/
	    
	    double saque(int cpfCli, double valorSaque) throws RemoteException;
	    double deposito(int cpfCli, double valorDeposito) throws RemoteException;
	    double transferencia(int cpfCli, int cpfDestinatario, double valorTransferencia) throws RemoteException;
	    
	    
	

}
