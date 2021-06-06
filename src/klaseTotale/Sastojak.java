package klaseTotale;

public class Sastojak {

	//Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
	//Omoguciti da cena moze i da se promeni, ali da nikada nece biti negativna.

	private String naziv;
	private double cenaKg;

	public Sastojak(String naziv, double cenaKg) {
		super();
		this.naziv = naziv;
		this.cenaKg = cenaKg;
	}

	public double getCenaKg() {
		return cenaKg;
	}

	public void setCenaKg(double cenaKg) {
		if (cenaKg > 0)
			this.cenaKg = cenaKg;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv);
		sb.append(" (cena po kilu je - ");
		sb.append(cenaKg);
		sb.append(" rsd)");
		return sb.toString();
	}

}
