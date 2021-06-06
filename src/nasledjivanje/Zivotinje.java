package nasledjivanje;

public class Zivotinje {
	
	//U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu 
	//(rod, porodica, poklasa.. Moze biti kicmenjak/beskicmenjak),
	//konkretan naziv i omiljenu hranu.

	private String ime;
	private String vrsta;
	private String hrana;

	public Zivotinje(String ime, String vrsta, String hrana) {

		this.ime = ime;
		this.vrsta = vrsta;
		this.hrana = hrana;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		if (vrsta.equals("kicmenjak") || vrsta.equals("beskicmenjak"))
			this.vrsta = vrsta;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime);
		sb.append("(");
		sb.append(vrsta);
		sb.append(")");
		sb.append(" ishrana - ");
		sb.append(hrana);

		return sb.toString();
	}

}
