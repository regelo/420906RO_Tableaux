package tableauxExeSup1;

public class ExerciceSupplementaire1 {

	public static void main(String[] args) {
		// Générer 1 200 000 valeurs entre 1 et 6 les conserver 
		// dans un tableau.

		final int NB_VALEURS = 1200000;
		int[] faces_generees = new int[6];
		
		for(int i=0 ; i<NB_VALEURS ; i++) {
			// Génère une valeur entre 1 et 6.
			int valeur_generee = (int) (1 + (Math.random()*6));
			
			// Incrémente la bonne case du tableau.
			// Case zéro : nombre de 1
			// Case un : nombre de 2
			// etc.
			faces_generees[valeur_generee-1] = faces_generees[valeur_generee-1] + 1;
		}
		
		// Affichage des résultats
		for(int i=1 ; i<=6 ; i++) {
			System.out.println("Nombre de " + i + " générés : " + faces_generees[i-1]);
		}
		
		// Calcul du Khi carré
		double khi_carre = 0;
		for(int i=1 ; i<=6 ; i++) {
			int delta = faces_generees[i-1] - 200000;
			double terme = (delta*delta)/200000.0;
			khi_carre = khi_carre + terme;
		}
		
		// Affichage du verdict final
		System.out.println("Khi-carré = " + khi_carre);
		if (khi_carre > 11.07) {
			System.out.println("Le générateur n'est pas bien balancé (95%) de chance.");
		}
		else {
			System.out.println("Rien n'indique que le générateur est mal balancé.");
		}
	}

}
