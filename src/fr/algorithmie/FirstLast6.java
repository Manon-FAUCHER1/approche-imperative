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
		
		 int[] array = new int[10]; //Pas de valeurs : false
		// int[] array = {1, -23, 45, 2, 8, 60, 17, -2, 9, -4}; // false
		// int[] array = {6, -23, 45, 2, 8, 60, 17, -2, 9, -4}; // P = 6 : true
		// int[] array = {1, -23, 45, 2, 8, 60, 17, -2, 9, 6}; // D = 6 : true
		// int[] array = {6, -23, 45, 2, 8, 60, 17, -2, 9, 6}; // P & D = 6 : true
		
		Boolean bool = false;
		
		
		if (array.length != 0 && (array[0] == 6 || array[array.length-1] == 6)) {		
			bool = true;
			System.out.println(" La condition est a : " + bool);
		} else {
			
		}
		System.out.println(" La condition est a : " + bool);

	}

}
