package geometria;

public class Cerchio extends FiguraColorata {
	protected double raggio;

	public Cerchio(Colore colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	void setRaggio(double myRaggio) {
		raggio = myRaggio;
	}
	
	double getRaggio() {
		return raggio;
	}
	
	public double calcolaArea() {
		return 3.14*raggio*raggio;
	}
}
