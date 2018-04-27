package geometria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mosaico3 {
	List<FiguraColorata> composizione = null;
	
	public void addFigura(FiguraColorata figura) {
		if(this.composizione == null) {
			this.composizione = new ArrayList<FiguraColorata>();
		}
		composizione.add(figura);
	}
	
	public void ordinaMosaico() {
		
		Collections.sort(this.composizione);
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
