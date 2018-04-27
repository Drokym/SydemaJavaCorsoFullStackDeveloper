package geometria;

import java.util.ArrayList;

public class FiguraComposta implements Figura {

	ArrayList<Figura> composizione = null;
	
	@Override
	public final double calcolaArea() {
		double area = 0;
		for(Figura figura : composizione) {
			area += figura.calcolaArea();
		}
		return area;
	}

	public final void addFigura(Figura figura){
		if (composizione == null) {
			composizione = new ArrayList<Figura>();
		}
		composizione.add(figura);
	}

	@Override
	public String toString() {
		String s = this.getClass().getSimpleName() + " composizione: " +  "";
		for(Figura figura : composizione) {
			s += figura + "\n";
		}
		return s;
	}
	

}
