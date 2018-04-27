package geometria;
import java.util.*;


public class Mosaico2 implements Comparator<FiguraColorata>{
	List<FiguraColorata> composizione = null;
	
	public void addFigura(FiguraColorata figura) {
		if(this.composizione == null) {
			this.composizione = new ArrayList<FiguraColorata>();
		}
		composizione.add(figura);
	}
	
	public void ordinaMosaico() {
		
		Collections.sort(this.composizione, this);
	}

	@Override
	public int compare(FiguraColorata arg0, FiguraColorata arg1) {
		return (int) Math.round(arg0.calcolaArea() - arg1.calcolaArea());
		
	}

	@Override
	public String toString() {
		String output = "";
		for(int i = 0; i < composizione.size(); i++) {
			output = output + composizione.get(i).toString() + "\n";
		}
		return output;
	}
	
	
	
}
