package klase;

public class Sport {

	public static void main(String[] args) {

		Sportista s1 = new Sportista("Sebastian Vettel", "F1");
		Sportista s2 = new Sportista("Marc Marquez", "MotoGP", "Honda", 93);
		Sportista s3 = new Sportista("Daniel Ricciardo", "F1");

		s1.setKlub("Ferrari");
		s1.setBrDresa(5);

		System.out.println(s1.getImePrezime() + " vozio je u " + s1.getSport() + " za " + s1.getKlub());
		
		System.out.println("Br bolida mu je " + s1.getBrDresa());

		s1.setKlub("Aston Martin");

		System.out.println(s1.getImePrezime() + " sada vozi za " + s1.getKlub());

		System.out.println(s2.getSport() + " trka je danas u 14h, a " + s3.getSport() + " trka je danas u 16h.");

		s3.setKlub("Red Bull");
		s3.setBrDresa(3);

		System.out.println(s3.getImePrezime() + " je vozio nekada za " + s3.getKlub());

		s3.setKlub("Aston Martin");
		
		System.out.println(s3.getImePrezime() + " sada vozi za " + s3.getKlub());

		System.out.println(s2.getImePrezime() + " je najjaci vozac ikad u " + s2.getSport() + "-u.");
		
		System.out.println("Njegov br motora je " + s2.getBrDresa() + " i vozi za " + s2.getKlub() + " tim");

	}

}
