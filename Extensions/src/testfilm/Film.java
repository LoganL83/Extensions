package testfilm;

public class Film {

	//propri�t�s partag�es par les sous-classes.
	String nom;
	int annee;
	int duree;
	String production;
	boolean couleur;
	int note;
	
	
	//Getters et setters = m�thodes qui r�cup�rent et affectent des valeurs � une variable.
	//m�thodes partag�es par les sous-classes.
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public boolean isCouleur() {
		return couleur;
	}
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
}
