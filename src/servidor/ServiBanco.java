package servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import Conec.conecDAO;
import Conec.conexao;

public class ServiBanco implements BancoRemoto {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//criar objeto servidor
			ServiBanco server = new ServiBanco();
			
			BancoRemoto stub = (BancoRemoto) UnicastRemoteObject.exportObject(server, 0);
			
			LocateRegistry.createRegistry( 20001 );  
			
			Registry registry = LocateRegistry.getRegistry(20001);
			
			// O método bind é então chamado no stub do registro para vincular 
			//o stub do objeto remoto ao nome "Hello" no registro.
			
			registry.bind("Banco", stub);

			System.err.println("Servidor pronto:");
			
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

	
	
	@Override
	public void criarConta(String nome, String cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP) throws RemoteException {
		
		System.out.println("servi banco antes criar conta");
		
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
		
		
	}
	
	@Override
	public double deposito(String contalogada, Double valor, String tipo) throws RemoteException, ClassNotFoundException {
		// TODO Auto-generated method stub
		conecDAO c = new conecDAO();
		try {
			c.deposito(contalogada, valor, tipo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERRO EM DEPOSITO: " + e.getMessage());
		}
		return 0;
	}

	@Override
	public void transferencia(String cpfCli, String tipoconta, String cpfDestinatario, String tipoconta2, double valorTransferencia) throws RemoteException {
		// TODO Auto-generated method stub
		transferencia(cpfCli, tipoconta, cpfDestinatario , tipoconta2 , valorTransferencia);
	}
	
	@Override
	public Double rendimento(String contaLogada, String tipoConta, int tempo) throws RemoteException {
		// TODO Auto-generated method stub
		return rendimento(contaLogada, tipoConta, tempo);
	}
	@Override
	public String logar(String conta, String senha)throws RemoteException, ClassNotFoundException, SQLException {
		System.out.println("logou");
		conecDAO c = new conecDAO();
		String resposta = c.logar(conta, senha);
		return resposta;
	}

	@Override
	public boolean criarRendaFixa() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void saque(String contalogada,  double valorSaque, String tipo) throws RemoteException, ClassNotFoundException{
		// TODO Auto-generated method stub
		conecDAO c = new conecDAO();
		try {
			c.saque(contalogada, valorSaque, tipo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERRO EM SAQUE: " + e.getMessage());
		}
	}

	@Override
	public double saldo(String contalogada, String tipo) throws RemoteException {
		// TODO Auto-generated method stub
		return saldo(contalogada, tipo);
	}

}
