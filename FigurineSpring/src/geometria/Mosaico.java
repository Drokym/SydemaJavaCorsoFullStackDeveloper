package geometria;
import java.util.ArrayList;

import geometria.FiguraColorata.Colore;

public class Mosaico {
	
	protected ArrayList<Rettangolo> composizione = new ArrayList<Rettangolo>();
	protected Rettangolo appoggio = new Rettangolo(Colore.BLU, new Dimensione(0, 0));
	
	public void addFigura(Rettangolo rettangolo) {
		composizione.add(rettangolo);
		
	}
	
	public void ordinaComposizione() {
		for (int i=0; i<composizione.size(); i++) {
			boolean flag = false;
			for (int j=0; j<composizione.size()-1; j++) {
				if( (composizione.get(j)).calcolaArea() > (composizione.get(j+1)).calcolaArea() ) {
					appoggio = composizione.get(j);
					composizione.set(j, composizione.get(j+1));
					composizione.set(j+1, appoggio);
					flag = true;
				}
			}
			if(!flag) break;
		}
	}
	
	public void stampaMosaico() {
		for (int i=0; i<composizione.size(); i++) {
			System.out.println("Figura: " + i + " colore: " + composizione.get(i).getColore() + " Base: " + composizione.get(i).getBase() + " Altezza: " + composizione.get(i).getAltezza() + " Area: " + composizione.get(i).calcolaArea());
		}
	}
}
