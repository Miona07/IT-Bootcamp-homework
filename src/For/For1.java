package For;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji omoguciti korisniku da unosi recii,
		 * sve dok ne unese rec “stop”,
		 * nebitno da li je koristio mala, velika slova ili kombinaciju.
		 * Mozete pri radu koristiti petlju po izboru.

		 * */

		Scanner sc = new Scanner(System.in);
		
		String rec;
		String s = "stop";
		String r1;  

	

		do {
			System.out.println("Unesite rec: ");
		
		rec = sc.nextLine();
	r1 = rec.toLowerCase();
		
		}
		
		while (!r1.equals(s)); {
			
			System.out.println("Uneli ste stop");
		}
	
		}
	}
