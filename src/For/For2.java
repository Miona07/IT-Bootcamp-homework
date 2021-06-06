package For;

public class For2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati
		 * zbir prirodnih brojeva do n na sledeci nacin:
1) u zbir nece ulaziti brojevi deljivi brojem 5
2) ako se naidje na broj 13, sabiranje ce se zavrsiti
i ispisace se zbir brojeva do tog trenutka.

		 * */

		int n = 18;
		int zbir = 0;
		
		for (int x =0; x <= n; x++) {
			
			
			if (x%5 != 0) {
				
				if (x == 13) 
					break;
				
				zbir = zbir + x;
				
				continue;
				
			}
			
		} System.out.println("Zbir je: " + zbir);
			
		}
		
		

}
