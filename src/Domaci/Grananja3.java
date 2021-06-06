package Domaci;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Napisati program koji na osnovu unetog naziva meseca ispisuje
		 * koliko ima meseci u godini koji pocinju na to slovo(na taj glas) 
		 * - za resavanje ovog zadatka koristiti switch
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti naziv meseca: ");
		String mesec;
		mesec = sc.nextLine();
		mesec = mesec.toLowerCase();
		
		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			
		System.out.println("Jos 2 meseca pocinju na slovo J");
		break;
		
		case "februar" :
			
			System.out.println("Nijedan mesec vise ne pocinje na slovo F");
			break;
			
		case "mart":
		case "maj":
		
		System.out.println("Jos 1 mesec pocinje na slovo M");
		break;
		
		case "april":
		case "avgust":
			System.out.println("Jos 1 mesec pocinje na slovo A");
			break;
			
		case "septembar":
			System.out.println("Septembar je jedini mesec na S");
			break;
			
		case "oktobar":
			System.out.println("Oktobar je jedini mesec na O");
			break;
			
		case "novembar":
			System.out.println("Novembar je jedini mesec na N");
			break;
			
		case "decembar":
			System.out.println("Decembar je jedini mesec na D");
			break;
			
			default:
				System.out.println("Nepostojeci mesec. Probaj ponovo.");
		}
	}

}
