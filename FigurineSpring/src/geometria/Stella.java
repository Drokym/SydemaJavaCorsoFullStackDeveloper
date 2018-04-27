package geometria;

public class Stella extends FiguraComposta{
	
	public Stella(double raggio, int punte) {
		super();
		double lato = raggio/2; // apotema
		PoligonoRegolare poli = new PoligonoRegolare(punte, lato);
		Triangolo tr = new Triangolo(lato, raggio/3);
		for(int x =0; x<punte; x++) {
			super.addFigura(tr);
		}
		super.addFigura(poli);
	}
	
	
}
