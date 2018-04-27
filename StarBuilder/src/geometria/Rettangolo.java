package geometria;

public class Rettangolo extends Quadrilatero {

	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", colore=" + colore + "]";
	}

	public Rettangolo(Colore colore, Dimensione dimensione) {
		super(colore, dimensione.getBase(), dimensione.getAltezza());
		
	}
	
	
	
}
