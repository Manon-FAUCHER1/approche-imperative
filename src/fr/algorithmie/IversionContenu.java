/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author manon
 *
 */
public class IversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;	
	
		int[] arrayCopy = IntStream.rangeClosed(1, array.length).map(i -> array[array.length-i]).toArray();

		System.out.println(Arrays.toString(array) + "\n" + Arrays.toString(arrayCopy));
	
		
	}

}
