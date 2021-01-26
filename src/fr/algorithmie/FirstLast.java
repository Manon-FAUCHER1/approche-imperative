/**
 * 
 */
package fr.algorithmie;

/**
 * @author manon
 *
 */
public class FirstLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[] array = {1, -23, 45, 2, 8, 60, 17, -2, 9, -4}; // L >= 1 && P != D : false
		// int[] array = {6, -23, 45, 2, 8, 60, 17, -2, 9, 6}; // L >= 1 && P == D : true
		// int[] array = {0};
		 Boolean bool = false;
		 
		 if (array.length >= 0 && (array[0] == array[array.length-1])) {
			 bool = true;
			 System.out.println(" La condition est a : " + bool);
		 } else {
			 System.out.println(" La condition est a : " + bool);
		 }
		 
		 
	}

}
