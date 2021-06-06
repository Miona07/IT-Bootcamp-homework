package funkcije;

import java.util.Scanner;

public class Funkcije3 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * i poziva i ispisuje dve metode. 
		 * Prva ispisuje zbir tri unesena broja, 
		 * a druga vraca najveci od unetih brojeva.
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

		int sabirak = brojevi(prvi, drugi, treci);
		System.out.println("Zbir brojeva je: " + sabirak);

		int maksi = maksimum(prvi, drugi, treci);
		System.out.println("Najveci broj je: " + maksi);

	}

	public static int brojevi(int a, int b, int c) {

		int zbir = a + b + c;
		return zbir;

	}

	public static int maksimum(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

}
