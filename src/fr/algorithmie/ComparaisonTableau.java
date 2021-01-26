/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author manon
 *
 */
public class ComparaisonTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		int nbElementCom = 0;
		
		System.out.println("Tableau 1 : " + Arrays.toString(array1));
		System.out.println("Tableau 2 : " + Arrays.toString(array2));
		System.out.println("\nVoici les nombres en commun dans les deux tableaux :");
		
		for (int i = 0; i < array1.length; i++) {
	        for (int j = 0; j < array2.length; j++) {
	            if (array1[i] == array2[j]) {
	            	nbElementCom = nbElementCom + 1;
	            	System.out.print(array2[j] + ", ");
	            } 
	        }
	    }   
		
		System.out.println("\nIl y a au total " + nbElementCom + " nombres en commun.");
		
		
	}

}
