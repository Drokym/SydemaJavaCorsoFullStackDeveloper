package geometria;

public class PoligonoRegolare extends FiguraColorata {
	protected int lati;
	protected double lunghezza;
	
	public PoligonoRegolare(Colore colore, int lati, double lunghezza) {
		super(colore);
		this.lati = lati;
		this.lunghezza = lunghezza;
	}

	public PoligonoRegolare(int lati, double lunghezza) {
		super(null);
		this.lati = lati;
		this.lunghezza = lunghezza;
	}

	void setDimensioni(int myLati, double myLunghezza){
		this.lati = myLati;
		this.lunghezza = myLunghezza;
	}
	
	int getLati() {
		return lati;
	}
	
	double getLunghezza() {
		return lunghezza;
	}
	
	double calcolaPerimetro() {
		return lati*lunghezza;
	}

	private double apotema()
	{	
		
		double alfa = Math.PI/lati;	
		return lunghezza/2 * Math.cos(alfa)/Math.sin(alfa);
	}
		
	public double calcolaArea() {
		double ap = apotema();
		return lunghezza/2 * ap * lati;
	}

	@Override
	public String toString() {
		return "PoligonoRegolare [lati=" + lati + ", lunghezza=" + lunghezza + "]";
	}
	
	

}
