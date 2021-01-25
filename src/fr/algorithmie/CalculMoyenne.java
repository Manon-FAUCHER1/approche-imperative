/**
 * 
 */
package fr.algorithmie;

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
		
		for (int nombre:array) {
			System.out.print(nombre+", ");
		}
		
		int somme = 0;
		
		for (int i = 0; i < array.length; i++) {
			somme += array[i];
		}
	         
		float moyenne = (float) somme / array.length;
		 
	    System.out.print("\nLa myenne des nombre est "+moyenne);
		
	}

}
