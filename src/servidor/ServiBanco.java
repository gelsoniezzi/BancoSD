package servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Conec.conecDAO;
import Conec.conexao;

public class ServiBanco implements BancoRemoto {
	
	
	/*
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//criar objeto servidor
			ServiBanco server = new ServiBanco();
			
			BancoRemoto stub = (BancoRemoto) UnicastRemoteObject.exportObject(server, 0);
			
			LocateRegistry.createRegistry( 20001 );  
			
			Registry registry = LocateRegistry.getRegistry(20001);
			
			/* O método bind é então chamado no stub do registro para vincular 
			 * o stub do objeto remoto ao nome "Hello" no registro.
			
			registry.bind("Banco", stub);

			System.err.println("Servidor pronto:");
			
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	*/
	
	@Override
	public boolean criarConta(String nome, int cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP) throws RemoteException {
		
		ContaCorrente conta = new ContaCorrente(nome,cpf, end, nascimento, tel, senha, saldoC, saldoP);
		conecDAO c = null;
		try {
			c = new conecDAO();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.criarConta(conta);
		
		// TODO Auto-generated method stub
		
		return false;
	}
	

	@Override
	public double saque(int cpfCli, double valorSaque, int tipo) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double deposito(int cpfCli, double valorDeposito, int tipo) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double transferencia(int cpfCli, int cpfDestinatario, double valorTransferencia, int tipoRemetente,
			int tipoDestino) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public boolean criarRendaFixa() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
