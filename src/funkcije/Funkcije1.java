package funkcije;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		 *  (znaci da korisnik unosi tri broja) i taj program treba da 
		 *  pozove i ispise (u mainu) najmanji od ta tri unesena broja.
		 * */

		Scanner sc = new Scanner(System.in);
		int prvi;
		int drugi;
		int treci;
		System.out.println("Unesite prvi broj: ");
		prvi = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		drugi = sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		treci = sc.nextInt();

		int najmanjiBr = najmanji(prvi, drugi, treci);
		System.out.println("Najmanji br je: " + najmanjiBr);
	}

	public static int najmanji(int a, int b, int c) {

		int min = a;

		if (b < min) {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		return min;
	}
}
