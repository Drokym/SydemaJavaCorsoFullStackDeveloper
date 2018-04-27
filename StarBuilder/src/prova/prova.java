package prova;

import starbuilder.*;
import geometria.*;
import geometria.FiguraColorata.Colore;

public class prova {
	
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(Colore.GIALLO, new Dimensione(4, 4));
		Rettangolo r2 = new Rettangolo(Colore.BLU, new Dimensione(3, 3));
		Rettangolo r3 = new Rettangolo(Colore.ROSSO, new Dimensione(2, 2));
		Rettangolo r4 = new Rettangolo(Colore.VERDE, new Dimensione(1, 1));
	
		
		Mosaico2 mos2 = new Mosaico2();
		
		Geometria geo = new Geometria();
		
		Cerchio c1 = new Cerchio(Colore.VERDE, 3);
		PoligonoRegolare pr1 = new PoligonoRegolare(Colore.BLU, 6, 10);
		
		geo.stampaArea(c1);
		geo.stampaPerimetro(pr1);
		
		mos2.addFigura(r1);
		mos2.addFigura(r2);
		mos2.addFigura(r3);
		mos2.addFigura(r4);
		
		mos2.ordinaMosaico();
		System.out.println(mos2);
		
		
		Stella s = new Stella(13, 5);
		
		
		System.out.println(s.calcolaArea());
		System.out.println(s);
		
		//StarBuilder for testing purposes
		
		StarDirector director = new StarDirector();
		NormalStar normalStar = new NormalStar();
        
		director.setStarBuilder(normalStar);
		director.constructStar();
        
        Figura figura = director.getFigura();
        
        director.setStarBuilder(normalStar);
        director.constructStar();
        
        figura = director.getFigura();
		
		
		
	}

}
