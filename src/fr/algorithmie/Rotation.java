/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author manon
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {0,1,2,3};
		
		System.out.println("Tableau avant rotation :\n" + Arrays.toString(array));
		
		int rota = array[array.length - 1];
		
		for (int i = array.length-1; i>= 0; i--) {
			if(i==0) {
				array[i] = rota;
			}else {
				array[i] = array[i - 1];
			}
		}

		System.out.println("\nTableau après rotation :\n" + Arrays.toString(array));
		
	}
}
