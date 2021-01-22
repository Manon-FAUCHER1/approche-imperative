/**
 * 
 */
package fr.declaration.variable;

/**
 * @author manon
 *
 */
public class DeclarationApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// DECLAREZ LES VARIABLES
		byte age = 21;
		short b = 12300;
		int codePostale = 44300;
		long d= 36415893L;
		float e = 2.9F;
		double f = -123.513;
		char lastName = 'F';
		boolean h = true;
		String fistName = "Manon";
		
		//AFFICHAGE DE LA VALEUR D’UNE VARIABLE
		System.out.println(age);
		System.out.println(b);
		System.out.println(codePostale);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(lastName);
		System.out.println(h);
		System.out.println(fistName);
		
		// Retour à la ligne dans une chaine de caractère
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString );
		randomString = "Voici le résultat d’un calcul : \n1+5=6";
		System.out.println(randomString );
		
	}

}
