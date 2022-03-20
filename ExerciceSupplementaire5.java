package tableauxexesup5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciceSupplementaire5 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);
		ArrayList<String> bottin = new ArrayList<String>();
		
		int choix;
		do {
			// On réinitialise le choix à une valeur invalide.
			choix = 0;
			
			System.out.println("  1. Afficher le contenu du bottin");
			System.out.println("  2. Ajouter une entrée au bottin");
			System.out.println("  3. Enlever une entrée du bottin");
			System.out.println("  4. Quitter le logiciel");
			System.out.print("Choix : ");
			
			if (lecteur.hasNextInt()) {
				choix = lecteur.nextInt();
			}
			
			// Vider le tampon
			lecteur.nextLine();
			
			switch (choix) {
			case 1:
				System.out.println(">> LE BOTTIN <<");
				for(int i=0 ; i<bottin.size(); i++) {
					System.out.println(bottin.get(i));
				}
				System.out.println(">>>>>>> <<<<<<<");
				break;
			case 2:
				System.out.print("Entrez un nom : ");
				String nom = lecteur.nextLine();
				System.out.print("Entrez un téléphone : ");
				String telephone = lecteur.nextLine();
				String entree = nom + " " + telephone;
				bottin.add(entree);
				break;
			case 3:
				System.out.println(">> LE BOTTIN <<");
				for(int i=0 ; i<bottin.size(); i++) {
					System.out.println("[" + i + "] " + bottin.get(i));
				}
				System.out.println(">>>>>>> <<<<<<<");
				System.out.print("Entrée à enlever ? ");
				int position = -1;
				if (lecteur.hasNextInt()) {
					position = lecteur.nextInt();
					if (position>=0 && position<bottin.size()) {
						bottin.remove(position);
					}
					else {
						System.out.println("Il ne s'agit pas d'une entrée valide.");
					}
				}
				else {
					System.out.println("Il faut entrer l'entier correspondant à l'entier à enlever.");
				}
				
				// Vider le tampon
				lecteur.nextLine();
				break;
			case 4:
				System.out.println("Au revoir !");
				break;
				default:
					System.out.println("Choix erroné !");
			}
			
		} while (choix!=4);

		lecteur.close();
	}

}
