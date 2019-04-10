package convertisseur;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		boolean restart;
		
		Scanner sc = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		Scanner scb = new Scanner(System.in);
				
		do {
			
			System.out.println("Rentrer 1 pour convertir de mètres en pieds \n"+"Rentrer 2 pour convertir de pieds en mètres");
			int choix = sc.nextInt();
			
			
			System.out.print("Rentrer un nombre à convertir : ");
			double valeur = sca.nextDouble();
			
			
			double result = Convertisseur.choix(choix, valeur);
			System.out.println("\nLe résultat est "+result);
			System.out.println("\nVoulez-vous recommencer ? (true/false)");
			restart = scb.nextBoolean();
			System.out.println("");
			
		}while(restart)	;
		
		System.out.println("Fin du programme !");
		
		sc.close();
		sca.close();
		
	}

}
