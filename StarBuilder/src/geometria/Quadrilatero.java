package geometria;

public class Quadrilatero extends FiguraColorata {
	protected double base;
	protected double altezza;
	
	public Quadrilatero(Colore colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	void setDimensioni(double myBase, double myAltezza) {
		this.base = myBase;
		this.altezza = myAltezza;
	}
	
	double getBase() {
		return base;
	}
	
	double getAltezza() {
		return altezza;
	}
	
	public double calcolaArea() {
		return base*altezza;
	}
	
}
