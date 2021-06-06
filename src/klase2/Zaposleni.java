package klase2;

public class Zaposleni {

	private String ime;
	private String prezime;
	private String pozicija;
	private int zarada;
	
	public Zaposleni(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public Zaposleni(String ime, String prezime, String pozicija, int zarada) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.zarada = zarada;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public int getZarada() {
		return zarada;
	}

	public void setZarada(int zarada) {
		this.zarada = zarada;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}
	
	
}
