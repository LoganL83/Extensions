package testbanque;

public class Account extends Application {

	int solde;
	int virement;
	int operation;
	
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	public int soldePEL(int solde, int virement) {
		int newSolde = solde - virement;
		return newSolde;	
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public int getVirement() {
		return virement;
	}
	public void setVirement(int virement) {
		this.virement = virement;
	}
	
}
