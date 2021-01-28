/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


/**
 * @author manon
 *
 */
public class Interfactif21Batons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int nbBaton = 21;
		int user;
		int ordi;
		
		boolean perdu = false;
		
		String[] tabBaton = new String[nbBaton];
		
		// insertion des b�tons dans le tableau
		for (int i = 0; i < tabBaton.length; i++) { tabBaton[i] = "|"; }
		
		System.out.println("Bienvenu dans le jeu des b�tons !\n"
				+ "Il y a en tout 21 b�tons, vous jouer contre l'ordinateur,"
				+ "a tour de role vous allez retirer 1,2 ou 3 b�tons, celui qui retire le dernier b�ton a perdu.\n"
				+ "Simple non ? Aller c'est parti !\n");
		
		// Choix du joueur qui commence
		int rjoueur = (int)(Math.random()*2);
		System.out.println(rjoueur);
		
		// C'est a l'utilisateur de jouer en premier
		if (rjoueur == 0) {
			
			System.out.println("C'est a vous de commencer."
					+ "\nIl y a " + nbBaton + " b�ton.");	
			
			do {
				// Affichage des b�tons
				for (String element : tabBaton) { System.out.print(element + " "); }
				
				// A l'utilisateur de jouer
				System.out.println("\n\nCombien voulez vous retirer de b�tons, 1,2 ou 3 ?");
				user = sc.nextInt();
				
				if (user < 1 || user > 3) {
					System.out.println("Saisi non valide vous devez choisir entre 1,2 et 3 !");
					user = sc.nextInt();
				}			
				
				// Modification du nombre de b�tons
				nbBaton -= user;
				String[] tabBaton2 = new String[tabBaton.length-user];
				for (int i = 0; i < tabBaton2.length; i++) { tabBaton2[i] = "|"; }
				tabBaton = tabBaton2;
	
				// Affichage des b�tons
				System.out.println("Il reste " + nbBaton + " b�ton.");
				for (String element : tabBaton) { System.out.print(element + " "); }
				
				if (nbBaton > 0) {
					// au tour de l'ordinateur
					ordi= 1 + r.nextInt(4 - 1);
					
					if (ordi > nbBaton) {
						ordi = nbBaton;
					}
					
					// Modification du nombre de b�tons
					nbBaton -= ordi;
					String[] tabBaton3 = new String[tabBaton.length-ordi];
					for (int i = 0; i < tabBaton3.length; i++) { tabBaton3[i] = "|"; }
					tabBaton = tabBaton3;
					
					// Affichage des b�tons
					System.out.println("\n\nL'ordinateur a retir� " + ordi + " b�tons."
							+ " Il reste " + nbBaton + " b�tons.");

					if (nbBaton == 0) {
						perdu = true;
					}
					
				}
				
				
			} while (nbBaton > 0);
			
			if (perdu) {
				System.out.println("Vous avez gagner !");
			} else {
				System.out.println("Vous avez perdu !");
			}
			
			
		} else { // c'est a l'ordianateur de jouer en premier 
			System.out.println("L'ordinateur a jouer en premier.\n");
			
			do {
				// au tour de l'ordinateur
				ordi= 1 + r.nextInt(4 - 1);
				if (ordi > nbBaton) {
					ordi = nbBaton;
				}
				
				// Modification du nombre de b�tons
				nbBaton -= ordi;
				String[] tabBaton3 = new String[tabBaton.length-ordi];
				for (int i = 0; i < tabBaton3.length; i++) { tabBaton3[i] = "|"; }
				tabBaton = tabBaton3;
				
				// Affichage des b�tons
				System.out.println("\nL'ordinateur a retir� " + ordi + " b�tons."
						+ " Il reste " + nbBaton + " b�tons.");
				
				// Affichage des b�tons
				for (String element : tabBaton) { System.out.print(element + " "); }
				
				if (nbBaton > 0) {
					// A l'utilisateur de jouer
					System.out.println("\n\nCombien voulez vous retirer de b�tons, 1,2 ou 3 ?");
					user = sc.nextInt();
					
					if (user < 1 || user > 3) {
						System.out.println("Saisi non valide vous devez choisir entre 1,2 et 3 !");
						user = sc.nextInt();
					}			
					
					// Modification du nombre de b�tons
					nbBaton -= user;
					String[] tabBaton2 = new String[tabBaton.length-user];
					for (int i = 0; i < tabBaton2.length; i++) { tabBaton2[i] = "|"; }
					tabBaton = tabBaton2;
		
					// Affichage des b�tons
					System.out.println("Il reste " + nbBaton + " b�ton.");
					for (String element : tabBaton) { System.out.print(element + " "); }
					
					if (nbBaton == 0) {
						perdu = true;
					}
					
				}
				
			} while (nbBaton > 0);
			
			if (perdu) {
				System.out.println("Vous avez perdu !");
			} else {
				System.out.println("Vous avez gagner !");
			}
			
			
			
		}			

	}

}
