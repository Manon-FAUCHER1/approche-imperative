/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author manon
 *
 */
public class SommeDeTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		
		
		int somme1 = 0;		
		for (int i = 0; i < array1.length; i++) {
			somme1 += array1[i];
		}
		
		int somme2 = 0;
		for (int i = 0; i < array2.length; i++) {
			somme2 += array2[i];
		}
		
		int[] arraySommes = {somme1, somme2};
		System.out.println(Arrays.toString(arraySommes));
		
	}

}
