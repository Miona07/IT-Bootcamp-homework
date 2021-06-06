package nasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class Staniste {

	//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive.
	//Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

	private String naziv;
	private List<Zivotinje> zivotinje;

	public Staniste(String naziv) {
		super();
		this.naziv = naziv;
	}

	public Staniste(String naziv, List<Zivotinje> zivotinje) {
		super();
		this.naziv = naziv;
		this.zivotinje = zivotinje;
	}

	public void dodajZivotinje(Zivotinje z) {
		zivotinje.add(z);
	}

	public void oduzmiZivotinje(int indeks) {
		zivotinje.remove(indeks);
	}

	public String getNaziv() {
		return naziv;
	}

	public List<Zivotinje> getZivotinje() {
		return zivotinje;
	}

	public void setZivotinje(List<Zivotinje> zivotinje) {
		this.zivotinje = zivotinje;
	}

}
