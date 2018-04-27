package geometria;

public class Pentagono extends PoligonoRegolare {
	
	public Pentagono(Colore colore, int lati, double lunghezza) {
		super(colore, lati, lunghezza);
		this.lati = 5;
		this.lunghezza = lunghezza;
	}
	
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	
	public double calcolaArea() {
		return lunghezza*lati;
	}
}
