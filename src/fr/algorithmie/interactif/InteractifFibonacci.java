/**
 * 
 */
package fr.algorithmie.interactif;

import java.util.Scanner;

/**
 * @author manon
 *
 */
public class InteractifFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int f0 = 0;
		int f1 = 1;
		int fn;
		
		System.out.println("Veuillez saisir le rang :\n");
		int n = sc.nextInt();
		
		System.out.println("f0 : " + f0 + "\nf1 : "+ f1);
		
		for (int i = 2; i <= n; i++) {
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;			
		 System.out.println("f" + i + " : " + fn);
		}
		
	}
}
