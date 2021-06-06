package nasledjivanje;

public class Ribe extends Zivotinje {
	
	//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda)
	//i vrsta peraja.

	private String voda;
	private String peraja;

	public Ribe(String ime, String vrsta, String hrana, String voda, String peraja) {
		super(ime, vrsta, hrana);
		this.voda = voda;
		this.peraja = peraja;
	}

	public String getVoda() {
		return voda;
	}

	public void setVoda(String voda) {
		if (voda.equals("slatka") || voda.equals("slana"))
			this.voda = voda;
	}

	public String getPeraja() {
		return peraja;
	}

	public void setPeraja(String peraja) {
		this.peraja = peraja;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getIme());
		sb.append("(");
		sb.append(super.getVrsta());
		sb.append(")");
		sb.append(" ishrana - ");
		sb.append(super.getHrana());
		sb.append(", zive u vodi koja je ");
		sb.append(voda);
		sb.append(" i peraja su ");
		sb.append(peraja);

		return sb.toString();
	}

}
