package Vezba;

import java.util.Scanner;

public class Vezbanjee1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcija;
		double racun = 0, kupovina = 0, naplata = 0;

		do {
			System.out.println("KASA");
			System.out.println("Trenutna cena odabranih proizvoda iznosi: " + racun + " din.");
			System.out.println("Odaberite opciju:");
			System.out.println("  0 - Izlaz iz programa (zatvaranje kase)");
			System.out.println("  1 - Dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
			System.out.println("  2 - Naplata racuna");
			opcija = sc.nextInt();

			switch (opcija) {
			case 1:
				System.out.println("Unesite cenu proizvoda:");
				kupovina = sc.nextDouble();
				while (kupovina <= 0) {
					System.out.println(
							"Nemamo besplatnih proizvoda, niti Vam placamo da uzmete neke od nasih proizvoda.");
					System.out.println("Unesite cenu proizvoda:");
					kupovina = sc.nextInt();
				}
				racun += kupovina;
				break;
			case 2:
				if (racun == 0) {
					System.out.println("Nemamo sta da naplatimo");
				} else {

					System.out.println(
							"Vas racun iznosi " + racun + " din. Unesite novac:");
					naplata = sc.nextInt();

					if (naplata == 0) {
						System.out.println("Odlucili ste da vratite sve proizvode");
			
						racun = 0;
						break;
					}

					while (naplata < racun && naplata != 0) {
						System.out.println("Vas iznos ne pokriva troskove racuna: " + racun
								+ " din. Molimo Vas ponovo unesite novca:");
						naplata = sc.nextInt();
					}
					System.out.println("Vas kusur iznosi " + (naplata - racun) + " din. Hvala!  Dodjite nam opet!");
					racun = 0;
				}
				break;

			case 0:
				if (racun > 0) {
					System.out.println("Vas racun nije naplacen. Morate da platite racun ili vratite sve proizvode");
					opcija = 2;
				} else
					System.out.println("Program zavrsen.");
				break;

			default:
				System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih opcija.");
				break;
			}
		} while (opcija != 0);
	}

}
