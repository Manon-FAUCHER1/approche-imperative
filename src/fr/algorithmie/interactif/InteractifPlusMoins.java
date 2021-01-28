/**
 * 
 */
package fr.algorithmie.interactif;


import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		final int max = 100;
		int nbessaie = 0;
		
		System.out.println("Bienvenu dans le jeux du nombre mystère. \n"
				+ "Voila les règles :\n"
				+ "L'ordinateur choisi un chiffre au hazar compris entre 1 et 100,\n"
				+ "Vous devrez trouver ce nombre grace aux indications donner.\n"
				+ "Etes-vous prêt ? C'est parti !\n"
				+ "\n"
				+ "Saisir un chiffre entre 1 et 100 : \n");
		
		// L'ordinateur choisi un nombre au hazar entre 1 & 100 
		int nbRandom = (int)(Math.random()*max);
		
		// Saisie de l'utilisateur
		int saisiUser = sc.nextInt();
		
		//Boucle tant que saisiUser n'est pas egal a nbRandom
		while (saisiUser < nbRandom || saisiUser > nbRandom) {
		
			if (saisiUser > nbRandom) {
				System.out.println("Plus petit");
			} else {
				System.out.println("Plus grand ");
			} 
			
			nbessaie++;
			
			// Re saisie de l'utilisateur
			saisiUser = sc.nextInt();	
		} 
		
		if(saisiUser == nbRandom) {
			System.out.println("Bravo vous avez trouvez en " + nbessaie + " coups !! \n");
		}
			
	}

}
