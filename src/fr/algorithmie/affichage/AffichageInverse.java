/**
 * 
 */
package fr.algorithmie.affichage;

import java.util.Arrays;

/**
 * @author Manon FAUCHER
 *
 */
public class AffichageInverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		System.out.println("Tableau de base :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}System.out.println("\n");
		
		
		// Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau 
		System.out.println("Tableau apr�s invertion :");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+ ", ");
		}
		
		// Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy
		int[] arrayCopy = array.clone();
		
		
	}

}
