/**
 * 
 */
package fr.algorithmie;

/**
 * @author manon
 *
 */
public class AffichagePartiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 
		 // Combiner une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3
		 for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);
			}
		 }
		 
		 // Combiner une boucle et un test de mani�re � n�afficher que les entiers pairs
		 for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		 }
			 
		 /* Combiner une boucle et un test de mani�re � n�afficher que les valeurs correspondant
		 aux index pairs */
		 for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
					System.out.println(array[i]);
			}
		 }
		 
		 // Combiner une boucle et un test de mani�re � n�afficher que les entiers impairs
		 for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		 }
		 
	}

}
