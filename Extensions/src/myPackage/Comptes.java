package myPackage;

public class Comptes {
	
	//Les différentes propriétées de la classe parent
	public int ID = 0;
	public String nom;
	public String prenom;
	public double solde ;
	
	
	
	//Et ses getters et setters.
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
