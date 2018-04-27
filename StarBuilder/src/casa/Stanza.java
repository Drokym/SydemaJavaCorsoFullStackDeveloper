package casa;

import geometria.Figura;

public class Stanza {
	Figura pavimento;
	
	public Stanza(Figura figura) {
		this.pavimento = figura;
	}
	
	public int mattonelle(Mattonella mattonella) {
		return (int) Math.round(pavimento.calcolaArea()/mattonella.area()*1.1);	
	}
	
}
