package tableauxexesup3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciceSupplmentaire3 {

	public static void main(String[] args) {
		final int NB_VALEURS_GENEREES = 100;
		
		// On remplit le tableau de NB_VALEURS_GENEREES valeurs entre 1 et 100.
		ArrayList<Integer> original = new ArrayList<Integer>();
		for(int i=0 ; i<NB_VALEURS_GENEREES ; i++) {
			int valeur_generee = (int) (1 + Math.random()*100);
			original.add(valeur_generee);
		}
		
		// On demande à la personne utilisatrice si elle veut choisir les
		// valeurs paires ou impaires.
		int choix = 0;
		boolean choix_correct = false;
		Scanner lecteur = new Scanner(System.in);
		do {
			System.out.print("Voulez-vous choisir les valeurs impaires (1) ou les valeurs paires (2) ? ");
			if (lecteur.hasNextInt()) {
				choix = lecteur.nextInt();
				if (choix==1 || choix==2) {
					choix_correct = true;
				}
				else {
					System.out.println("Il fallait entrer 1 ou 2");
				}
			}
			else {
				System.out.println("Il fallait entrer un entier 1 ou 2");	
			}
			
			// On vide le tampon
			lecteur.nextLine();
			
		} while(!choix_correct);
		lecteur.close();
		
		// On choisit les valeurs demandées
		ArrayList<Integer> choisies = new ArrayList<Integer>();
		for(int i=original.size()-1 ; i>=0 ; i--) {
			int une_valeur = original.get(i);
			if (choix==1 && une_valeur%2==1) {
				original.remove(i);
				choisies.add(une_valeur);
			}
			else if (choix==2 && une_valeur%2==0) {
				original.remove(i);
				choisies.add(une_valeur);				
			}
		}
		
		// Affichage des deux tableaux
		System.out.println("Originales (sans les choisies) : ");
		System.out.println(original);
		System.out.println("Choisies : ");
		System.out.println(choisies);
	}

}
