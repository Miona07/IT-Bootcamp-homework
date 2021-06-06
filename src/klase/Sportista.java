package klase;

public class Sportista {

	/*
	 * sport - Napisati klasu Sportista. Sportista ima 1) ime i prezime (polje tipa
	 * String) koje moze da se dohvati, ali ne i postavi 2) sport kojim se bavi
	 * (polje tipa String) koje moze da se dohvati ali ne i postavi 3) klub za koji
	 * igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni
	 * klub za koji igra. 4) broj koji nosi na dresu ( tipa int) koje moze i da se
	 * dohvati i da se postavi.
	 * 
	 * Napisati glavni program koji kreira tri igraca. U glavnom programu
	 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
	 * Sportista.
	 */
	private String imePrezime;
	private String sport;
	private String klub; // moze da se setuje i ovde i u mainu
	private int brDresa;

	public Sportista(String imePrezime, String sport) {
		this.imePrezime = imePrezime;
		this.sport = sport;

	}

	public Sportista(String imePrezime, String sport, String klub, int brDresa) {
		this.imePrezime = imePrezime;
		this.sport = sport;
		this.klub = klub;
		this.brDresa = brDresa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public String getSport() {
		return sport;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public String getKlub() {
		return klub;
	}

	public void setBrDresa(int brDresa) {
		this.brDresa = brDresa;
	}

	public int getBrDresa() {
		return brDresa;
	}
}
