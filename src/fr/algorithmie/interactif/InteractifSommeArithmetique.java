/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifSommeArithmetique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int saisiUser;
		int nb = 0;
		
		System.out.println("Veuillez saisir un chiffre compris entre 1 et 10 :");
		saisiUser = sc.nextInt();
		
		for (int i = 0; i <= saisiUser; i++) {
			nb +=  i;
		}
		
		System.out.println("La somme de tous les entierd compris entre 1 et " 
							+ saisiUser 
							+ " est : " 
							+ nb);
		
	}
}
