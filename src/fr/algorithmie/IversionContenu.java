/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author manon
 *
 */
public class IversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;	
	
		/* Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy mais
		dans l�ordre inverse.*/
		int[] arrayCopy = IntStream.rangeClosed(1, array.length).map(i -> array[array.length-i]).toArray();

		// Afficher l�ensemble des �l�ments des 2 tableaux
		System.out.println("Avant inversion :\n" 
						+ Arrays.toString(array) 
						+ "\nApr�s inversion :\n" 
						+ Arrays.toString(arrayCopy));
	
		}

}
