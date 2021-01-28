/**
 * 
 */
package fr.algorithmie.recherche;

/**
 * @author manon
 *
 */
public class RechercheMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int valueMax = 0;
		
		for (int nombre:array) {
			System.out.print(nombre+", ");
		}
		
		// Rechercher le plus grand élément du tableau
		for (int i = 0; i < array.length; i++) {
			if (array[i] > valueMax) {
				valueMax = array[i];
			}
		}
		
		System.out.println("\nLa valeur la plus grande du tableau est " + valueMax);

	}

}
