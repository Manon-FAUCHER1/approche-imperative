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
public class InteractifStockageNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int[] array = new int[3];
		
		int i = 0;
		
		int option1 = 1;
		int option2 = 2;
		int saisiOption;		
		
		
		do {
			System.out.println("\nVeulliez choisir une option ( 1 ou 2) :\n"
					+ "1 - Ajouter un nombre \n"
					+ "2 - Afficher les nombres existants");
			saisiOption = sc.nextInt();
			
			if(saisiOption == option1) { // option 1
				
				if (i >= array.length) {
					int[] array2 = new int[array.length+1];
					
					for (int j = 0; j < array.length; j++) {
						array2[j] = array[j];
					}
					
					array = array2;
					
				}
				
				System.out.println("\nVeuillez saisir un chiffre : ");
				int saisinb = sc.nextInt();
				
				array[i] = saisinb;
				i++;
				
			} else if (saisiOption == option2) {
				System.out.println(Arrays.toString(array));
			} 
			
		} while (saisiOption == option1 || saisiOption == option2);
		
				
		System.out.println("Fin.");
			
		
	}
}
