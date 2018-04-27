package geometria;

public class Esagono extends PoligonoRegolare{

	public Esagono(Colore colore, double lunghezza) {
		super(colore, 6, lunghezza);
		this.lunghezza = lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
}
