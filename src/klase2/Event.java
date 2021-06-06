package klase2;

public class Event {
	//Napraviti klasu Event koja sadrzi podatke o vremenu,
	//dvorani u kojoj se dogadjaj organizuje i tip (koncert, utakmica, vencanje…)

	//Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, 
	//gradu gde se nalazi i kapacitetu (broju mesta).

	//Uvezati ove klase i u glavnom programu se igrati sa njima.

	private String time;
	private Dvorana dvorana;
	private String tip;
	
	public Event(String time, Dvorana dvorana, String tip) {
		super();
		this.time = time;
		this.dvorana = dvorana;
		this.tip = tip;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
}
