package klaseTotale;

import java.util.ArrayList;
import java.util.List;

public class Jelo {

	//Jelo imai svoj naziv i proizvoljno mnogo sastojaka,
	//a za svaki sastojak treba znati i koliko grama je potrebno. 
	//Pri kreiranju se zadaje samo naziv jela.
	//Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda ovako:
	//public void dodajSastojak(Sastojak s, int kolicina);
	//Lista sastojaka moze da se dohvati, kao i naziv.
	//U klasi jelo postoji metoda koja racuna koliko novca je potrebno 
	//da bi se sve namirnice nabavile.

	private String naziv;
	private List<Sastojak> sastojci;
	private List<Integer> kolicine;

	public Jelo(String naziv) {
		super();
		this.naziv = naziv;
		this.kolicine = new ArrayList<Integer>();
		this.sastojci = new ArrayList<Sastojak>();
	}

	public Jelo(String naziv, List<Sastojak> sastojci, List<Integer> kolicine) {
		super();
		this.naziv = naziv;
		this.sastojci = sastojci;
		this.kolicine = kolicine;
	}

	public String getNaziv() {
		return naziv;
	}

	public List<Sastojak> getSastojci() {
		return sastojci;
	}

	public List<Integer> getKolicine() {
		return kolicine;
	}

	public void dodajSastojak(Sastojak s, int kolicina) {
		sastojci.add(s);
		kolicine.add(kolicina);

	}

	public double novac() {
		double novac = 0;
		double cenaPoKg = 0;
		int gramaza = 0;
		for (int i = 0; i < getSastojci().size(); i++) {
			cenaPoKg = sastojci.get(i).getCenaKg();
			gramaza = kolicine.get(i);
			novac = novac + (gramaza / 1000.0) * cenaPoKg;
			System.out.println(gramaza + " " + cenaPoKg + " " + ((gramaza / 1000.0) * cenaPoKg));
		}
		return novac;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv);
		sb.append(": ");
		for (int i = 0; i < sastojci.size(); i++) {
			sb.append(sastojci.get(i).getNaziv() + ", ");
		}

		return sb.toString();
	}

	// Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice

}

