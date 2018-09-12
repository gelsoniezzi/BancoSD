package cliente;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/*// Importados do Git
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

import cliente.ClienteGUI;
import cliente.ClienteInterface;
import servidor.BancoRemoto;


public class Cliente extends UnicastRemoteObject implements ClienteInterface {
    
    private ClienteGUI gui;
    
    public Cliente (ClienteGUI gui) throws RemoteException {
    
        this.gui = gui;
    }
    
    public void showNotification(String message) throws RemoteException {
    
        JOptionPane.showMessageDialog(gui, message);
    }
}

*/
// Exemplo original

 
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;
import java.util.Scanner;

import servidor.BancoRemoto;
import servidor.ServiBanco;

public class Cliente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
    	
		System.out.println("Informe o endereco do RMIRegistry");
        String host = teclado.nextLine();
        try {
        	
            Registry registry = LocateRegistry.getRegistry(host, 20001);
            
            BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
            
            //System.out.println("A soma entre 20 e 10 é: ");
    
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}
	
	public void criarConta(String nome, String cpf, String end, String nascimento, String tel, String senha, double saldoC, double saldoP) throws RemoteException {
		
		 try {
			Registry registry = LocateRegistry.getRegistry( 20001);
	        
	        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
	        
	        
	       try {
	    	   
		       stub.criarConta(nome, cpf,end, nascimento, tel, senha,saldoC ,saldoP);
	    	   
	       } catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	       
	        
		} catch (Exception e) {
			 System.out.println("catch");
		}
		
	}
	public String logarcli(String conta, String senha) throws RemoteException, NotBoundException, ClassNotFoundException, SQLException {
		
		//ServiBanco b = new ServiBanco();
		Registry registry = LocateRegistry.getRegistry( 20001);
        
        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
        System.out.println("foi");
		try {
			
			System.out.println("LOGOU " + stub.logar(conta, senha));
			return stub.logar(conta, senha);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO AO LOGAR" + e.getMessage());
			return "";
		}
		  
	}
	public double saldoCli(String conta, String tipo) throws RemoteException, NotBoundException, ClassNotFoundException, SQLException {
		//ServiBanco b = new ServiBanco();
				Registry registry = LocateRegistry.getRegistry( 20001);
		        
		        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
		        System.out.println("foi");
				try {
					
					System.out.println("LOGOU " + stub.saldo(conta, tipo));
					return stub.saldo(conta, tipo);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					System.out.println("ERRO AO LOGAR" + e.getMessage());
					return 0;
				}
		
	}
	
	public double depositoCli(String conta,double valor, String tipo) throws RemoteException, NotBoundException, ClassNotFoundException, SQLException {
		Registry registry = LocateRegistry.getRegistry( 20001);
        
        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
        System.out.println("foi");
		try {
			
			//System.out.println("Deposito : R$ " + Double.parseDouble(stub.deposito(conta, valor, tipo))+ ",em "+tipo);
			return stub.deposito (conta, valor, tipo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO AO DEPOSITAR" + e.getMessage());
			return 0;
		}
	}
	
	public void saqueCli(String contalogada,  double valorSaque, String tipo) throws ClassNotFoundException, AccessException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry( 20001);
        
        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
        System.out.println("foi");
		try {
			stub.saque(contalogada, valorSaque, tipo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO NO SAQUE" + e.getMessage());
			
		}
	}
	
	public void transferenciaCli(String cpfCli, String tipoconta, String cpfDestinatario, String tipoconta2, double valorTransferencia) throws RemoteException, NotBoundException, ClassNotFoundException {
		Registry registry = LocateRegistry.getRegistry( 20001);
        
        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
        System.out.println("foi");
		try {
			stub.transfere(cpfCli,  tipoconta, cpfDestinatario, tipoconta2, valorTransferencia);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO NO SAQUE" + e.getMessage());
			
		}
	}
	public double rendimentoCli(String contaLogada, String tipoConta, int tempo) throws ClassNotFoundException, SQLException, AccessException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry( 20001);
        
        BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
        System.out.println("foi");
		try {
			return stub.rendimento(contaLogada,tipoConta, tempo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO AO CALCULAR O RENDIMENTO: " + e.getMessage());
			return 0;
			
		}
		
	}
}

 
