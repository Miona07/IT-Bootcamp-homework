package While;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
 * onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 
 * */
		
		Scanner sc = new Scanner (System.in);
		
		int unos = 0;
		int brojac = 1;
		
		System.out.println("Unesi broj: ");
		unos = sc.nextInt();	

		
		while ( unos >= brojac ) {
			 
			System.out.println("Laku noc!");

			brojac = brojac + 1;
								
		}
		
	}

}
