/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifTantQue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int saisiUser;
		do {
			
			System.out.println("Veuillez saisir un chiffre compris entre 1 et 10 :");
			saisiUser = sc.nextInt();
			
		} while (!(saisiUser >= 0 && saisiUser <= 10));
		
	
		
		

	}

}
