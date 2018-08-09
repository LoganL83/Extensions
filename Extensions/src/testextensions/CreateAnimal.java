package testextensions;

public class CreateAnimal {

	public static void main(String argv[]) {
		
		Chien monChien = new Chien();
		monChien.setNom("Medor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle " + monChien.getNom() +  " et il fait " +monChien.aboie());
		Chat monChat = new Chat();
		monChat.setNom("Nuage");
		monChat.setCouleur("Blanc");
		System.out.println("Mon chat s'appelle " + monChat.getNom() + " et il fait " + monChat.miaule());
		
	}

}
