package Vezba;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		/*
		 * 0 izlaz
		 * 1 engleski
		 * 2 srpski
		 * 3 unos cene
		 * 4 naplata
		 * 5 pdv od racuna
		 * 
		 * */

		Scanner sc = new Scanner(System.in);

		double cena = 0;
		double novac = 0;
		double kusur = 0;
		double racun = 0;
		double pdv = 0;
		int izbor = 0;

		do {

			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - Srpski");
			System.out.println("2 - English");
			System.out.println("3 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
			System.out.println("4 - naplata racuna");
			System.out.println("5 - PDV od racuna");

			System.out.println();
			System.out.println("Unesite izbor: ");
			izbor = sc.nextInt();

			if (izbor > 5 || izbor < 0) {
				System.out.println("Greska! Mozete uneti 0/1/2/3/4/5");
				System.out.println();
				continue;
			}

			switch (izbor) {
			case 3:
				System.out.println("Unesite cenu proizvoda:");
				cena = sc.nextDouble();
				racun = racun + cena;
				if (cena == 0) {
					System.out.println("Nije moguce uneti proizvod bez cene, unesite ponovo");
					System.out.println();
				}
				break;

			case 4:
				System.out.println("Vas racun je: " + racun + " din");

				System.out.println("Unesite Vas novac: ");
				novac = sc.nextDouble();

				if (novac >= racun) {
					kusur = novac - racun;
					System.out.println("Vas kusur je " + kusur + " din");

				} else {
					double razlika = racun - novac;
					System.out
							.println("Niste uneli dovoljno novca, nedostaje jos " + razlika + " din, probajte ponovo");
					System.out.println();
				}
				break;

			case 5:
				pdv = racun * 0.2;
				System.out.println("PDV od Vaseg racuna je " + pdv);
				System.out.println();
				break;

			}

		} while (izbor != 0);
		{
			System.out.println("Izasli ste iz programa");
		}
	}

}

