package klaseTotale;

public class Torta extends Jelo {

//Torta je jelo za koje se moze doci do informacije o tome da li sadrzi margarin ili ne.
//Dodatni zahtev: moze se doci i do informacije o tome
	//koliko procenata sećera postoji u odnosu na celu tortu.

	public Torta(String naziv) {
		super(naziv);
	}

	public boolean margarin() {
		boolean margarinJe = false;
		for (int i = 0; i < super.getSastojci().size(); i++) {
			if (super.getSastojci().get(i).getNaziv().equals("margarin")) {
				margarinJe = true;
				break;
			}

		}
		return margarinJe;

	}

	public double procenatSecera() {
		double procenat = 0.0;
		double zbir = 0;
		int gramazaSecera = 0;
		int kolicinaSastojka = 0;
		for (int i = 0; i < super.getSastojci().size(); i++) {
			kolicinaSastojka = super.getKolicine().get(i);
			zbir = zbir + kolicinaSastojka;
			if (super.getSastojci().get(i).getNaziv().equals("secer")) {
				gramazaSecera = kolicinaSastojka;
				System.out.println("Gramaza secera: " + gramazaSecera);
			}
		}

		System.out.println("Ukupna gramaza: " + zbir);

		procenat = (gramazaSecera / zbir) * 100;

		return procenat;
	}
}
