/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int[] array = new int[10];
		int valueMax = 0;
		
		for (int i = 0; i < array.length; i++) {			
			System.out.println("Veillez saisir un chiffre");
			array[i] = sc.nextInt();
			
			if (array[i] > valueMax) {
				valueMax = array[i];
			}
		}
		
		System.out.print(Arrays.toString(array));
		System.out.println("\nLa valeur la plus grande que vous avez saisie est " + valueMax);
		
		
		
		
	}
}
