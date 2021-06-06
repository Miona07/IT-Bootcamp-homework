package nasledjivanje;

public class Sisari extends Zivotinje {

	//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

	private String bojaDlake;
	private int brNogu;

	public Sisari(String ime, String vrsta, String hrana, String bojaDlake, int brNogu) {
		super(ime, vrsta, hrana);
		this.bojaDlake = bojaDlake;
		this.brNogu = brNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public int getBrNogu() {
		return brNogu;
	}

	public void setBrNogu(int brNogu) {
		this.brNogu = brNogu;
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
		sb.append(", boja dlake je ");
		sb.append(bojaDlake);
		sb.append(" i ima ");
		sb.append(brNogu);
		sb.append(" noge ");

		return sb.toString();
	}

}
