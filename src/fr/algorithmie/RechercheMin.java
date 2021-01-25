/**
 * 
 */
package fr.algorithmie;

/**
 * @author manon
 *
 */
public class RechercheMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int valueMin = 0;
		
		for (int nombre:array) {
			System.out.print(nombre+", ");
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < valueMin) {
				valueMin = array[i];
			}
		}
		
		System.out.println("\nLa valeur la plus petite du tableau est " + valueMin);

	}

}
