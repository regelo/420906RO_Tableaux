package tableauexesup4;

import java.util.Scanner;
import java.util.ArrayList;

public class ExerciceSupplementaire4 {

	public static void main(String[] args) {
		// On remplit initialement le tableau.
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		for(int i=2 ; i<=100 ; i++)
			entiers.add(i);
		
		// Boucle qui demande des valeurs
		Scanner lecteur = new Scanner(System.in);
		do {
			System.out.println("Le tableau contient présentement : ");
			System.out.println(entiers);
			System.out.print("Entrez une valeur entière >=2 et <=100 : ");
			if (lecteur.hasNextInt()) {
				int diviseur = lecteur.nextInt();
				if (diviseur>=2 && diviseur<=100) {
					for(int i=entiers.size()-1 ; i>=0 ; i--) {
						int une_valeur = entiers.get(i);
						if (une_valeur%diviseur==0) {
							entiers.remove(i);
						}
					}
				}
				else {
					System.out.println("On voulait une valeur entière >=2 et <=100 !");					
				}
			}
			else {
				System.out.println("On voulait une valeur entière !");
			}
			
			// Vider le tampon
			lecteur.nextLine();
		
		} while(entiers.size()>0);
		
		lecteur.close();
		
		System.out.println("Vous avez vidé le tableau, bravo !");
	}

}
