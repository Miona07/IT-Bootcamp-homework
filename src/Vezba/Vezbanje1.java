package Vezba;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. 
		 * Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda 
i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna,
 potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna
	 ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.

		 * */

		Scanner sc = new Scanner(System.in);
		System.out.println("0 - Izlaz iz programa");
		System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
		System.out.println("2 - naplata racuna");

		int izbor;
		System.out.println();
		System.out.println("Unesite izbor: ");
		izbor = sc.nextInt();
		double cena = 0;
		double novac = 0;
		double zbir = 0; // racun
		double kusur = 0;
		double racun = 0;

		while (izbor > 0 && izbor < 3) {

			switch (izbor) {

			case 1:
				System.out.println("Unesite cenu proizvoda: ");
				cena = sc.nextDouble();
				racun = racun + cena;
				break;

			case 2:
				System.out.println("Unesite Vas novac: ");
				novac = sc.nextDouble();

				if (novac < racun) {
					System.out.println("Greska!");
				} else {
					kusur = novac - racun;
					System.out.println("Vas kusur je: " + kusur);
					System.out.println();
				}
				break;
			}

			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
			System.out.println("2 - naplata racuna");
			System.out.println();
			System.out.println("Unesite izbor: ");
			izbor = sc.nextInt();

		}

		if (izbor == 0) {
			System.out.println("Program zavrsen");

		} else {
			System.out.println("Greska! Mozete uneti samo 0/1/2");
		}
	}
}


