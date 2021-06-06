package klase3;

import java.util.ArrayList;
import java.util.List;

public class TakeOff {

	public static void main(String[] args) {

		Putnici p1 = new Putnici("Miona", "Milcic");
		Putnici p2 = new Putnici("Matija", "Milcic");
		Putnici p3 = new Putnici("Filip", "Celi Svet", 45789345);
		Putnici p4 = new Putnici("Pera", "Peric", 4567893);
		Putnici p5 = new Putnici("Nikola", "Nikolic");
		Putnici p6 = new Putnici("Nera", "Neric");
		Putnici p7 = new Putnici("Joka", "Jokic");

		List<Putnici> lista1 = new ArrayList<Putnici>();
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p4);
		lista1.add(p6);
		lista1.add(p7);

		List<Putnici> lista2 = new ArrayList<Putnici>();
		lista2.add(p2);
		lista2.add(p4);
		lista2.add(p5);

		List<Putnici> lista3 = new ArrayList<Putnici>();
		lista3.add(p3);
		lista3.add(p5);
		lista3.add(p6);
		lista3.add(p7);

		List<Putnici> lista4 = new ArrayList<Putnici>();
		lista4.add(p1);
		lista4.add(p2);
		lista4.add(p5);

		Putovanje d1 = new Putovanje("Maldivi", 1200, lista3);
		Putovanje d2 = new Putovanje("Tajland", 990, lista1);
		Putovanje d3 = new Putovanje("Meksiko", 1900, lista2);
		Putovanje d4 = new Putovanje("Japan", 2100, lista4);
		Putovanje d5 = new Putovanje("Sejseli", 1300, null);

		List<Putovanje> ponuda = new ArrayList<Putovanje>();
		ponuda.add(d1);
		ponuda.add(d2);
		ponuda.add(d5);

		System.out.println(d1.getDestinacija() + " do kraja maja su " + d1.getCena());
		d1.setCena(1099);
		System.out.println("A od juna " + d1.getCena());

		System.out.println(ponuda.size());
		ponuda.remove(2);
		System.out.println(ponuda.size());

		System.out.println("Putnici putovanja na Tajland su: ");
		System.out.println();
		for (int i = 0; i < lista1.size(); i++) {

			System.out.println(lista1.get(i).getPrezime());

		}

		lista1.remove(3);
		System.out.println();
		System.out.println("NOVI SPISAK, putnici za Tajland: ");
		System.out.println();
		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i).getPrezime());

		}
	}

}
