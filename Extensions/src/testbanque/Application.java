package testbanque;

public class Application {

	
	public static void main(String[] args) {
		
		Account pierreAccount = new Account();
		Account aureliaAccount = new Account();
		
		
		pierreAccount.setSolde(200);
		aureliaAccount.setSolde(100);
	

		System.out.println("Le nouveau solde du compte de Pierre est de " + pierreAccount.soldePEL(200, 25) + " €");
		
		System.out.println("Le nouveau solde du compte d'Aurélia est de " + aureliaAccount.setSolde(100) + 
				pierreAccount.setVirement(25) + " €");
	}

}
