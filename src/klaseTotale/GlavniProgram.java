package klaseTotale;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {

		Sastojak s1 = new Sastojak("margarin", 500);
		Sastojak s2 = new Sastojak("secer", 100);
		Sastojak s3 = new Sastojak("so", 35);
		Sastojak s4 = new Sastojak("ulje", 160);
		Sastojak s5 = new Sastojak("kakao", 300);
		Sastojak s6 = new Sastojak("brasno", 50);

		System.out.println(s4);
		s4.setCenaKg(180);
		System.out.println(s4);

		List<Sastojak> namirnice1 = new ArrayList<Sastojak>();
		namirnice1.add(s1);
		namirnice1.add(s2);
		namirnice1.add(s5);
		namirnice1.add(s6);

		List<Sastojak> namirnice2 = new ArrayList<Sastojak>();
		namirnice2.add(s3);
		namirnice2.add(s4);
		namirnice2.add(s6);

		Jelo j1 = new Jelo("torta");
		Jelo j2 = new Jelo("kolac");
		Jelo j3 = new Jelo("corba");
		Jelo j4 = new Jelo("pasta");

		j1.dodajSastojak(s1, 250);
		j1.dodajSastojak(s2, 150);
		j1.dodajSastojak(s5, 200);
		j1.dodajSastojak(s6, 300);
		j2.dodajSastojak(s6, 350);
		j3.dodajSastojak(s3, 10);
		j3.dodajSastojak(s4, 10);
		j4.dodajSastojak(s4, 20);

		System.out.println("Cena namirnica za jelo 2 je: " + j2.novac());
		System.out.println(j1.novac());

		Torta t1 = new Torta("coko");
		t1.dodajSastojak(s6, 300);
		t1.dodajSastojak(s5, 200);
		System.out.println(t1.margarin());
		t1.dodajSastojak(s1, 250);
		t1.dodajSastojak(s2, 100);
		System.out.println(t1.margarin());
		System.out.println(t1.procenatSecera());

		Meni m1 = new Meni();
		m1.dodajJelo(j1);
		m1.dodajJelo(j2);
		m1.dodajJelo(j3);
		m1.dodajJelo(j4);

		System.out.println(m1);

	}

}
