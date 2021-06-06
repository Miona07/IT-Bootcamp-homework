package nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izracunava proizvod elemenata niza tipa int, 
		 * koji su veci od njihovog indeksa.
		 * Za unos niza i za proizvod koristiti zasebno metode.
		 * Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
		 * 
Primer ucitanog niza: 3 7 1 4 2 5
Primer izracunatog proizvoda: 84
		 * */
		int[] unesenNiz;

		unesenNiz = unosNiza();
		int pro = proizvod(unesenNiz);

		System.out.println("Unesen niz je :" + Arrays.toString(unesenNiz));
		System.out.println("Proizvod je: " + pro);

	}

	public static int[] unosNiza() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		for (int i = 0; i < duzina; i++) {

			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();
		}
		return niz;
	}

	public static int proizvod(int[] uneseniNiz) {
		int pr = 1;
		for (int i = 0; i < uneseniNiz.length; i++) {

			if (uneseniNiz[i] > i) {
				pr = pr * uneseniNiz[i];
			}
		}

		return pr;
	}

}
