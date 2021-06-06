package klaseTotale;

public class Supa extends Jelo {

	//Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva 
	//koja moze da se dohvati.

	private double duzinaKuvanja;

	public Supa(String naziv, double duzinaKuvanja) {
		super(naziv);
		this.duzinaKuvanja = duzinaKuvanja;
	}

	public double getDuzinaKuvanja() {
		return duzinaKuvanja;
	}

}
