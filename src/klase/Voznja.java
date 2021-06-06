package klase;

public class Voznja {

	public static void main(String[] args) {

		Automobil a1 = new Automobil("Panda", "Fiat", 492745);
		Automobil a2 = new Automobil("Yaris", "Toyota", 374534);
		Automobil a3 = new Automobil("Ibiza", "Seat", 453225);
		Automobil a4 = new Automobil("x5", "BMW", 337754);
		Automobil a5 = new Automobil("a8", "Audi", 234643);

		a1.setVlasnik("Misa Milcic");
		a2.setVlasnik("Miona Milcic");
		a3.setVlasnik("Biba Cetkovic");
		a4.setVlasnik("Caje Nis");
		a5.setVlasnik("Pera Peric");

		System.out.println("Vozac crne " + a1.getMarka() + " " + a1.getModel() + " je " + a1.getVlasnik());
		
		System.out.println("Serijski br.vozila " + a2.getMarka() + " " + a2.getModel() + " je " + a2.getSerijskiBr());
	

		a5.setVlasnik("Nikola Jovanovic");

		System.out.println(a5.getVlasnik() + " je vlasnik vozila " + a5.getModel() + " " + a5.getMarka());
		
		System.out.println(a2.getVlasnik() + " bi volela da poseduje " + a4.getMarka() + " " + a4.getModel());

	}

}
