package tableauxExeSup2;

import java.util.Arrays;

public class ExerciceSupplementaire2 {

	public static void main(String[] args) {
		final int NB_FAUX_MOTS = 10;
		
		final String voyelles = "aeiouy";
		final String consonnes = "bcdfghjklmnpqrstvwxz";
		
		String[] faux_mots = new String[10];
		
		for(int i=0 ; i<NB_FAUX_MOTS ; i++) {
			String faux_mot = "";
			
			// Ajout de la consonne initiale majuscule.
			int position_lettre = (int) (Math.random()*consonnes.length());
			faux_mot = faux_mot + consonnes.charAt(position_lettre);
			faux_mot = faux_mot.toUpperCase();
			
			// Ajout de la première voyelle.
			position_lettre = (int) (Math.random()*voyelles.length());
			faux_mot = faux_mot + voyelles.charAt(position_lettre);
			
			// ajout de la première consonne minuscule.
			position_lettre = (int) (Math.random()*consonnes.length());
			faux_mot = faux_mot + consonnes.charAt(position_lettre);			

			// Ajout de la deuxième voyelle.
			position_lettre = (int) (Math.random()*voyelles.length());
			faux_mot = faux_mot + voyelles.charAt(position_lettre);
			
			// ajout de la dernière consonne minuscule.
			position_lettre = (int) (Math.random()*consonnes.length());
			faux_mot = faux_mot + consonnes.charAt(position_lettre);

			// Ajout de la dernière voyelle.
			position_lettre = (int) (Math.random()*voyelles.length());
			faux_mot = faux_mot + voyelles.charAt(position_lettre);
			
			// Ajout du mot généré au tableau.
			faux_mots[i] = faux_mot;
		}
		
		// On met les faux-mots en ordre alphabétique.
		Arrays.sort(faux_mots);
		
		// On affiche les dix mots.
		for(int i=0 ; i<faux_mots.length ; i++) {
			System.out.println(faux_mots[i]);
		}

	}

}
