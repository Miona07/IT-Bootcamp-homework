package klase2;

public class Dogadjaj {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		
		Dvorana d1 = new Dvorana("Hangar", "Beograd", 5000);
		Dvorana d2 = new Dvorana("Belexpo centar", "Beograd", 3000);
		Dvorana d3 = new Dvorana("Magacin Depo", "Beograd", 4000);
		Dvorana d4 = new Dvorana("Spens arena", "Novi Sad", 3500);
		
		Event e1 = new Event("23h", d1, "rejv");
		Event e2 = new Event("14h", d4, "utakmica");
		Event e3 = new Event("23h", d3, "rejv");
		Event e4 = new Event("15h", d2, "svadba");
		Event e5 = new Event("08-20h", d2, "imunizacija");
		
		sb.append(" u ");
		sb.append(" je ");
		
		String u = sb.substring(0, 3);
		String je = sb.substring(3,7);
		

		System.out.println("Apgrade se odrzava u dvorani " + d1.getIme() + u + d1.getGrad() + u + e3.getTime());
		 
		System.out.println("Imunizacija stanovnista je u " + d2.getIme() + " svaki dan od " + e5.getTime());
		
		System.out.println("Najbolje mesto za zurke je " + d1.getIme()+ ", a nekada je bio " + d3.getIme() + " dok ga nisu srusili");
		
		System.out.println( d2.getIme()+ " je najpogodniji za proslave tipa " + e4.getTip());
		
		System.out.println("Nekada je kapacitet " + d3.getIme() + " bio " + d2.getKapacitet());
		
		d3.setKapacitet(0);
		
		System.out.println("A sada je " + d3.getKapacitet());
		
		System.out.println("Najveca dvorana u " + d4.getGrad() + je + d4.getIme());
		
		e1.setTime("otkazano");
		
		System.out.println(e1.getTip() + " u " + d4.getIme() + je + e1.getTime());
		
		System.out.println("Neka " + e2.getTip() + " se tamo odrzava u " + e2.getTime());
	}

}
