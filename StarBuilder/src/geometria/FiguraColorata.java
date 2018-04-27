package geometria;

import java.awt.Color;

public abstract class FiguraColorata implements Figura, Comparable<FiguraColorata> {
	
	//wrapper di int
	Integer i = new Integer(0);
	
	//colore prova 1
	public enum Colore {BLU, GIALLO, ROSSO, VERDE};
	
	//colore prova 2
	protected OggettoColorato Colore2;
	
	//colore prova 3
	
	Color Colore3 = new Color(1, 1, 1, 1);
	
	//colore prova 4
	protected Colore colore4;
	
	
	
	@Override
	public int compareTo(FiguraColorata o) {
		return (int) Math.round(this.calcolaArea() - o.calcolaArea());
	}
	
	protected Colore colore;
	
	public FiguraColorata(Colore colore) {
		this.colore = colore;
	}
	
	public void setColore(Colore myColor) {
		colore = myColor;
	}
	
	public Colore getColore() {
		return colore;
	}
	
	
	
}
