package klase3;

import java.util.List;

public class Putovanje {

	//Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika.
	//Putnici imaju ime, prezime i broj pasosa.
	//U glavnom programu se igrati i testirati napisane klase.
	//Obavezni deo: napraviti bar 3 razlicita putovanja. 
	//Po zelji staviti putovanja u listu koja se zove ponuda. 
	//Jednom putovanju bar promeniti cenu aranzmana. 
	//Izbaciti jedno putovanje iz ponude.
	//Sa putovanja izbaciti jednog od putnika.
	
	private String destinacija;
	private int cena;
	private List<Putnici> putnici;
	
	public Putovanje(String destinacija, int cena, List<Putnici> putnici) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		this.putnici = putnici;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public List<Putnici> getPutnici() {
		return putnici;
	}

	public void setPutnici(List<Putnici> putnici) {
		this.putnici = putnici;
	}
	
	
}
