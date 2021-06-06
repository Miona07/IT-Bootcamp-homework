package DoWhile;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze.
		 * On moze da kupuje sve dok mu ne ostane samo 89 dinara
		 * jer mu toliko novca treba da kupi BUSPLUS kartu
		 * i vrati se kuci sa novogodisnjim poklonima.
		 * Pera treba  da unosi pojedinacne cene poklona,
		 * a program treba da ga obavesti kada potrosi sav predvidjeni novac,
		 * to jest kada za sledeci poklon vise nema kinte.

		 * dopuniti tako da program ispise koliko je poklona Pera uspeo da kupi.
		 * */

		
		Scanner sc = new Scanner (System.in);
		
		 int budzet = 0; // sa koliko Pera raspolaze  npr 3000
		 int n; // pojedinacna cena poklona
		 int min = 89; // koliko mora da ostane
		 int razlika = 0;
		 int brojac = 0;
		 
		 
		 System.out.println("Pero, koji ti je budzet? ");
		 budzet = sc.nextInt();
		 
		  do {
				System.out.println("Pero, unesi cenu poklona: "); 
				
				n = sc.nextInt();
				
				budzet = budzet - n;
				
				razlika = budzet - min;
				
				brojac = brojac + 1;
				
		  }
				
				while (budzet >= 89); {
				 
System.out.println("Nemate dovoljno kredita za BUSPLUS");
		  }
				
	 System.out.println("Pera je uspeo da kupi " + (brojac - 1) + " poklona.");
	}
}
