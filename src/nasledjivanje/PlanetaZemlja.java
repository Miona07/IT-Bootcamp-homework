package nasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class PlanetaZemlja {

	public static void main(String[] args) {
		
		//Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		//Ispisati bar jedno staniste.
		//Jednom sisaru zameniti boju dlake.

		Staniste k = new Staniste("kopneno");
		Staniste v = new Staniste("vodeno");

		Zivotinje z1 = new Zivotinje("macka", "kicmenjak", "govedina");
		Zivotinje z2 = new Zivotinje("zebra", "kicmenjak", "trava");
		Zivotinje z3 = new Zivotinje("foka", "kicmenjak", "riba");
		Zivotinje z4 = new Zivotinje("slon", "kicmenjak", "trava");
		Zivotinje z5 = new Zivotinje("panda", "kicmenjak", "bambus");
		Zivotinje z6 = new Zivotinje("zmija", "beskicmenjak", "govedina");
		Zivotinje z7 = new Zivotinje("hobotnica", "beskicmenjak", "skoljke");

		System.out.println(z5);

		List<Zivotinje> kopnene = new ArrayList<Zivotinje>();
		kopnene.add(z1);
		kopnene.add(z2);
		kopnene.add(z4);
		kopnene.add(z5);
		kopnene.add(z6);

		List<Zivotinje> vodene = new ArrayList<Zivotinje>();
		vodene.add(z3);
		vodene.add(z6);
		vodene.add(z7);

		for (int i = 0; i < kopnene.size(); i++) {
			System.out.println(kopnene.get(i).getIme());
		}

		Sisari s1 = new Sisari("kengur", "kicmenjak", "trava", "braon", 4);
		Sisari s2 = new Sisari("koala", "kicmenjak", "eukaliptus", "sivkasta", 4);

		Ribe r1 = new Ribe("pirana", "kicmenjak", "ljudi", "slatka", "ostra");
		Ribe r2 = new Ribe("skarpina", "kicmenjak", "alge", "slana", "ostra");

		System.out.println(s2);
		s2.setBojaDlake("crno-bela");
		System.out.println(s2);

		System.out.println(r1);

		for (int i = 0; i < vodene.size(); i++) {
			System.out.println(vodene.get(i).getIme());
		}
		
		System.out.println(vodene.size());
		vodene.remove(1);
		System.out.println(vodene.size());

		for (int i = 0; i < vodene.size(); i++) {
			System.out.println(vodene.get(i).getIme());
		}

		System.out.println(kopnene.size());
		System.out.println(kopnene.get(4).getIme());

	}

}
