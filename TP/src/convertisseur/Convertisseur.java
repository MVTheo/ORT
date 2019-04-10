package convertisseur;

public class Convertisseur {
	
	public static double piedToMetre(double pieds) {
		double metre = pieds/3.281;
		return metre;
	}
	
	public static double metreToPied(double metre) {
		double pied = metre*3.281;
		return pied;
	}
	
	public static double choix(int choix, double valeur) {
		if (choix==1 ) {
			return metreToPied(valeur);
		}
		else {
			return piedToMetre(valeur);
		}
	}

}
