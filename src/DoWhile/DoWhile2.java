package DoWhile;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce korisniku ispisati poruku
		 * da li je ceo pozitivan broj koji je uneo palindrom ili nije palindrom.
		 * (palindromi -> isto mu dodje citali sleva nadesno ili s desne na levu stranu).
		 * */

		int n = 0;
		int cifra;
		int n1 = 0;
	
	  // palindrom 12321, nije palindrom 27384
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite broj");
		 n = sc.nextInt();
		
		 int originalniBr = n;
		 
		 while (n != 0) {
			 
			
			 cifra = n % 10;
			 n1 = n1 * 10 + cifra;
				n = n / 10;
		 }
		 
		
		System.out.println( "Original br " + originalniBr);
		System.out.println( "Novi br " + n1);
		 
				
				if (originalniBr == n1) {
					System.out.println("Palindrom je");
				}
					
					else {
						System.out.println("Nije palindrom");
					}	
	} 

}
