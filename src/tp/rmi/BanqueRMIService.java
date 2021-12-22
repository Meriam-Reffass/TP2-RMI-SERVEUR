package tp.rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List; 
import tp.metier.Compte;

public class BanqueRMIService extends UnicastRemoteObject implements IBanqueRemote {

	private static final long serialVersionUID = 6351009266375932560L;

	public BanqueRMIService() throws RemoteException {
		super();	}
    public double conversion(double montant) throws RemoteException {
		return montant*1.98;
	}
	public Compte consulterCompte(int code) throws RemoteException {
		Compte cp= new Compte(1,Math.random()*9000,new Date());
		return cp;
	}	
	public List<Compte> listComptes() throws RemoteException {
		List<Compte> cptes=new ArrayList<Compte>();
		cptes.add(new Compte(1,Math.random()*9000,new Date()));
		cptes.add(new Compte(2,Math.random()*9000,new Date()));
		cptes.add(new Compte(3,Math.random()*9000,new Date()));
		return cptes;
	}	
}

