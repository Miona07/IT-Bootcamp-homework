package Domaci;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji na osnovu unete godine i meseca ispisuje
		 * koliko taj mesec ima dana.
		 * (Vodite racuna o prestupnoj godini!)
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite godinu: ");
	
		int godina;
		godina = sc.nextInt();
		
		System.out.println("Unesite mesec: ");
		String mesec;
		Scanner sc1 = new Scanner(System.in);
		mesec = sc1.nextLine();
		mesec = mesec.toLowerCase();
		
		
		switch (mesec) {
		case "januar" :
		case "mart" :
		case "maj" :
		case "jul":
		case "avgust":
		case "oktobar":
		case "decembar":
			System.out.println("Ovaj mesec ima 31 dan.");
			break;
			
		case "april":
		case "jun":
		case "septembar":
		case "novembar":
			System.out.println("Ovaj mesec ima 30 dana.");
			break;
			
		case "februar":
			if (godina % 4 == 0) {
				System.out.println("Februar ima 29 dana.");
				
			}
			else {
				System.out.println("Februar ima 28 dana.");
			}
		}
		
	}

}
