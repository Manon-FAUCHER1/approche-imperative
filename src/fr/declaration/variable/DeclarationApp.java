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
		String fistName = "Manon";
		char lastName = 'F';
		byte age = 21;
		float taille = 1.65F;
		int codePostale = 44300;
		
		short b = 053;
		long d= 36415893L;
		double f = -123.513;
		boolean h = true;
		
		//AFFICHAGE DE LA VALEUR D’UNE VARIABLE
		System.out.println(fistName);
		System.out.println(lastName);
		System.out.println(taille);
		System.out.println(age);
		System.out.println(codePostale);
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(h);
		
		
		// Retour à la ligne dans une chaine de caractère
		String randomString = "Voici le résultat d’un calcul : 1+5=6";
		System.out.println(randomString );
		randomString = "Voici le résultat d’un calcul : \n1+5=6";
		System.out.println(randomString );
		
	}

}
