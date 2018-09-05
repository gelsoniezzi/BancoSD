package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import servidor.BancoRemoto;

public class Cliente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
    	
		System.out.println("Informe o endereco do RMIRegistry");
        String host = teclado.nextLine();
        try {
        	
            Registry registry = LocateRegistry.getRegistry(host, 20001);
            
            BancoRemoto stub = (BancoRemoto) registry.lookup("Banco");
            
//            System.out.println("A soma entre 20 e 10 é: " + stub.saque(30, 10,10));
    
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}
}
