package geometria;

import java.awt.Color;

public class Colore {
	Color c;

	//wrapper classi uguali con limitazione del campo di azione
	//information hiding
	
	public Colore(int red, int green, int blue) {
		this.c = new Color(red, green, blue);
	}
	
	
	public int getBlue() {
		return c.getBlue();
	}
	
	public int getGreen() {
		return c.getGreen();
	}
	
	public int getRed() {
		return c.getRed();
	}
	
}
