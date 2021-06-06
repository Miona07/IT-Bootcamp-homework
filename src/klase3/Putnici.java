package klase3;

public class Putnici {

	private String ime;
	private String prezime;
	private int brPasosa;
	
	
	public Putnici(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}


	public Putnici(String ime, String prezime, int brPasosa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brPasosa = brPasosa;
	}


	public int getBrPasosa() {
		return brPasosa;
	}


	public void setBrPasosa(int brPasosa) {
		this.brPasosa = brPasosa;
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}
	
	
}
