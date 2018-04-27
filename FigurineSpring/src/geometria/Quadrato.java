package geometria;

public class Quadrato extends PoligonoRegolare {

	

	@Override
	public String toString() {
		return "Quadrato [lunghezza=" + lunghezza + ", colore=" + colore + "]";
	}

	public Quadrato(Colore colore, int lati, double lunghezza) {
		super(colore, lati, lunghezza);
		this.colore = colore;
		this.lati = 4;
		this.lunghezza = lunghezza;
	}
	
	public void setLato(double lato) {
		this.lunghezza = lato;
	}
	
	public double getLato() {
		return lunghezza;
	}

	public double calcolaArea() {
		return lunghezza*lunghezza;
	} 
	
}
