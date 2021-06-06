package klase2;

public class Posao {

	public static void main(String[] args) {

		Zaposleni z1 = new Zaposleni("Miona", "Milcic");
		Zaposleni z2 = new Zaposleni("Matija", "Milcic");
		Zaposleni z3 = new Zaposleni("Pera", "Peric", "komercijalista", 500);
		Zaposleni z4 = new Zaposleni("Laza", "Lazic", "sales menadzer", 600);
		Zaposleni z5 = new Zaposleni("Zika", "Zikic", "CEO", 800);
		Zaposleni z6 = new Zaposleni("Lara", "Laric");
		Zaposleni z7 = new Zaposleni("Neda", "Nedic");
		Zaposleni z8 = new Zaposleni("Tara", "Taric");

		Zaposleni[] niz = { z1, z2, z3, z4, z5, z6, z7, z8 };
		Zaposleni[] n1 = { z3, z5, z6, z7 };
		Zaposleni[] n2 = { z1, z2, z8 };
		Zaposleni[] n3 = { z2, z4, z7, z8 };
		Zaposleni[] n4 = { z1, z5, z6, z8 };

		Firma f1 = new Firma("Disko", "Beograd", 63947592, n1);
		Firma f2 = new Firma("IT", "Nis", 73058460, n2);
		Firma f3 = new Firma("Call centar", "Beograd", 73026495, n3);
		Firma f4 = new Firma("AS", "Beograd", 93740285, n4);
		Firma f5 = new Firma("Mucenici", "svet", 35893758, niz);

		StringBuilder sb = new StringBuilder();

		sb.append(" je firma u ");
		sb.append(" PIB broj je: ");
		sb.append(" i broj zaposlenih je ");

		String je = sb.substring(1, 13);
		String pib = sb.substring(13, 27);
		String z = sb.substring(27, 49);

		System.out.println(f2.getNaziv() + je + f2.getSediste() + pib + f2.getPib() + z + f2.getZaposleni().length);

		// System.out.println(f1.getZaposleni()[2].getPrezime());

		System.out.println("Zaposleni u " + f1.getNaziv() + " su: ");

		for (int i = 0; i < f1.getZaposleni().length; i++) {
			System.out.println(f1.getZaposleni()[i].getPrezime());
		}

		z1.setPozicija("CC");
		z2.setPozicija("CEO");
		z6.setPozicija("sales executive");
		z7.setPozicija("volonter");
		z8.setPozicija("Cistacica");

		z1.setZarada(1000);
		z2.setZarada(1000);
		z6.setZarada(700);
		z7.setZarada(550);
		z8.setZarada(400);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("_");
		sb1.append(":");
		sb1.append("(");
		sb1.append(")");

		String donjaCrta = sb1.substring(0, 1);
		String dveTacke = sb1.substring(1, 2);
		String zagradaO = sb1.substring(2, 3);
		String zagradaZ = sb1.substring(3, 4);

		System.out.println(z3.getIme().toUpperCase() + donjaCrta + z3.getPrezime().toUpperCase() + dveTacke
				+ z3.getPozicija() + zagradaO + z3.getZarada() + zagradaZ);

	}

}
