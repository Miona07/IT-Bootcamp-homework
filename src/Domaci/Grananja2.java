package Domaci;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prvi domaci zadatak od 15.4.2021. uraditi ponovo,
		 * koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina
		 * (kakvi celi brojevi moraju da budu visina, sirina i duzina?)

		 * */
		
		System.out.println("Unesi dimenzije prostorije");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("unesite duzinu u metrima: ");
		int duzina;
		duzina = sc.nextInt();
		
		if(duzina < 1) {
			System.out.println("Duzina mora biti pozitivna");
			return;
		}	
		
		System.out.println("unesite sirinu u metrima ");
		int sirina;
		sirina = sc.nextInt();
		
		if(sirina < 1) {
			System.out.println("Sirina mora biti pozitivna");
			return;
		}	
		
		System.out.println("unesite visinu u metrima ");
		int visina;
		visina = sc.nextInt();
		
		if(visina < 1) {
			System.out.println("Visina mora biti pozitivna");
			return;
		}	
		
		int povrsina = duzina * sirina + 2*(sirina * visina) + 2*(duzina * visina);
		
		System.out.println("Povrsina okrecenog prostora je " + povrsina + " m2");
		
		// racuna se krecenje zidova i plafona (bez poda)
		
	}
}
