/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Veuillez saisir un chiffre :");
		int saisiUser = sc.nextInt();
		
		System.out.print("Voici les 10 chiffres suivant : \n");
		for (int i = 0; i <= 9; i++) {
			
			saisiUser += 1;
			System.out.print(saisiUser + ", ");
		}
		
	}

}
