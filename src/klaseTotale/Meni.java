package klaseTotale;

import java.util.ArrayList;
import java.util.List;

public class Meni {

	//Meni sadrzi listu jela. Sadrzi metodu koja dodaje jelo u meni.
	//Moze da se ispise ceo meni u sledećem formatu: 
		//Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
		//Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
		//Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice

	private List<Jelo> jela;

	public Meni() {
		super();
		this.jela = new ArrayList<Jelo>();
	}

	public Meni(List<Jelo> jela) {
		super();
		this.jela = jela;
	}

	public void dodajJelo(Jelo j) {
		jela.add(j);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meni je: ");
		sb.append("\n");
		for (int i = 0; i < jela.size(); i++) {
			sb.append(jela.get(i));
			sb.append("\n");
		}
		return sb.toString();
	}

}
