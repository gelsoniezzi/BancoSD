package servidor;

/*
 * Interface divulgando metodos remotos do cliente
 */


import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ClienteInterface extends Remote {
    
    public void showNotification(String message) throws RemoteException;
}

