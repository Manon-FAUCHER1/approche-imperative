/**
 * 
 */
package fr.algorithmie;

/**
 * @author manon
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int[] array = new int[10]; // false
		// int[] array = {1, -23, 45, 2, 8, 60, 17, -2, 9, -4}; // false
		// int[] array = {6, -23, 45, 2, 8, 60, 17, -2, 9, -4}; // true
		// int[] array = {1, -23, 45, 2, 8, 60, 17, -2, 9, 6}; // true
		// int[] array = {6, -23, 45, 2, 8, 60, 17, -2, 9, 6}; // true
		
		Boolean bool = false;
		
		
		if (array.length != 0 && (array[0] == 6 || array[array.length-1] == 6)) {		
			bool = true;
		}
		
		System.out.println(bool);

	}

}
