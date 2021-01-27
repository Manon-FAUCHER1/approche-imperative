/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author manon
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println(Arrays.toString(array));
		
		int somme = 0;
		
		for (int i = 0; i < array.length; i++) {
			somme += array[i];
		}
	         
		float moyenne = (float) somme / array.length;
		 
	    System.out.print("\nLa myenne est de "+moyenne);
		
	}

}
