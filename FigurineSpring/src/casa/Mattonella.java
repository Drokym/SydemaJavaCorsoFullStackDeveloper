package casa;

import geometria.Figura;

public class Mattonella extends Stanza {
	Figura forma;
	double spessore;
	String materiale;
	
	public Mattonella(Figura forma, double spessore) {
		super(forma);
		this.spessore = spessore;
		this.forma = forma;
		
	}
	
	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	public double getSpessore() {
		return spessore;
	}

	public void setSpessore(double spessore) {
		this.spessore = spessore;
	}

	public double area() {
		return forma.calcolaArea();
	}
	
}
