package geometria;

public class Triangolo extends FiguraColorata {
	protected double base;
	protected double altezza;
	
	public Triangolo(Colore colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	public Triangolo(double base, double altezza) {
		super(null);
		this.base = base;
		this.altezza = altezza;
	}

	public void setDimensioni(double myBase, double myAltezza) {
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
		return (base*altezza) / 2;
	}

	@Override
	public String toString() {
		return "Triangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
	
}
