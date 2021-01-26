/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifTableMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int saisiUser;

		do {
			
			System.out.println("Veuillez saisir un chiffre compris entre 1 et 10 :");
			saisiUser = sc.nextInt();
			
			if (saisiUser >= 0 && saisiUser <= 10) {
				System.out.println("Voici la table de multiplication pour le chiffre " + saisiUser);
				for (int i = 0; i <= 10; i++) {
					int op = saisiUser*i;
					System.out.println(saisiUser + " * " + i + " = " + op);     
				}
			}
			
		} while (!(saisiUser >= 0 && saisiUser <= 10));
		
		
		
	}
}
