import java.net.MalformedURLException ;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import tp.rmi.BanqueRMIService;

public class ServeurRMI {

	public static void main(String[] args) throws RemoteException {
			
		try {

			LocateRegistry.createRegistry(1099) ;
			BanqueRMIService service = new BanqueRMIService();
			System.out.println(service.toString()); 
			Naming.rebind("rmi://localhost:1099/BK",service) ;
			
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
}







