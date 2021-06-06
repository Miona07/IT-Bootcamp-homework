package funkcije;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza
		 *  i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
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

		int proizvod = brojevi(prvi, drugi, treci);
		System.out.println("Proizvod ova 3 broja je: " + proizvod);
	}

	public static int brojevi(int a, int b, int c) {

		int puta = a * b * c;
		return puta;
		
	}
}
