package geometria;

public class Geometria {
	
	public void stampaArea(FiguraColorata figura) {
		System.out.println("L'area della figura e' " + figura.calcolaArea());
	}
	
	public void stampaPerimetro(PoligonoRegolare poli) {
		System.out.println("Il perimetro della figura e' " + poli.calcolaPerimetro());
	}
}