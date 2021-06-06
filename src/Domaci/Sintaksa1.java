package Domaci;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji ce racunati povrsinu okrecene prostorije,
		 * tako sto se ivice prostorije ucitavaju preko konzole.
		 * (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika
		 * i da nema prozora i vrata).
		 * */
		
		System.out.println("Unesi dimenzije prostorije");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("unesite duzinu u metrima: ");
		double duzina;
		duzina = sc.nextDouble();
		
		System.out.println("unesite sirinu u metrima ");
		double sirina;
		sirina = sc.nextDouble();
		
		System.out.println("unesite visinu u metrima ");
		double visina;
		visina = sc.nextDouble();
		
		double povrsina = duzina * sirina + 2*(sirina * visina) + 2*(duzina * visina);
		
		// racuna se krecenje zidova i plafona (bez poda)
		
		System.out.println("Povrsina okrecenog prostora je " + povrsina + "m2");
		
		
		
	}

}
