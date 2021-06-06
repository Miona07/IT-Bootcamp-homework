package For;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		/*
		 * Napraviti program koji ce odstampati na standardnom izlazu trougao od zvezdica.
		 *  Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati ovako:

		 			* * * * *
		 		      * * * *
		 		        * * *
		 		          * *
		 		            * 
		 	
		 */
		
		Scanner sc = new Scanner (System.in);
		int n;
		int i;
		int j;
		System.out.println("Unesite broj ");
		n = sc.nextInt();
		
		for (i=1; i <=n; i++ ) {	
			for (j= 1; j<=n ; j++) {	
			    if(i > j) {
			    	System.out.print("  ");	
			    } else {
			       System.out.print("* ");
			    }
			} 
			System.out.println();
		}
	}

}
