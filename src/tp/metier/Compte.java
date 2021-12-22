package tp.metier;
import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;
	int code;
	double solde;
	Date dateCreation;
	public Compte(int code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation =  date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}	
	
}