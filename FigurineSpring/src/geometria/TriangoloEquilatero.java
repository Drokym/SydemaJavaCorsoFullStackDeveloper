package geometria;

public class TriangoloEquilatero extends PoligonoRegolare {

	protected double base;
	protected double altezza;

	public TriangoloEquilatero(Colore colore, Dimensione dimensione) {
		super(colore, 3, 0);
		this.lati = 3;
		this.base = dimensione.getBase();
		this.altezza = dimensione.getAltezza();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double calcolaArea() {
		return base*altezza/2;
	}
}
