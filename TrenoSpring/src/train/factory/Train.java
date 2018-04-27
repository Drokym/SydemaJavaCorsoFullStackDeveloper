package train.factory;

import java.util.*;
import exception.*;


public class Train {
	
	protected List<Wagon> composition = new ArrayList<Wagon>();

	public Train() {
		
	}
	
	public Train(List<Wagon> composition) {
		this.composition = composition;
	}

	public void isBlank() throws Throwable {
		if(composition.isEmpty() || composition == null) {
			throw new Throwable("train.isBlank.BlankTrainException");
		}else {
			System.out.println("");
		}
	}

	public void addWagon(Wagon wagon) {
		composition.add(wagon);

	}

	@Override
	public String toString() {
		try {
			this.isBlank();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Train [composition=" + composition;
	}

	public String stampWagon(int i) {
		return "Train [Wagon pos = " + i + " | composition = " + composition.get(i) + "]";
	}
	
	public void turnTrain() throws NoDoubleHeaderException {
		
		if((composition.get(0) instanceof Header 
			||composition.get(0) instanceof Header) 
				&&
		   (composition.get(composition.size()-1) instanceof Header 
		    ||composition.get(composition.size()-1) instanceof Header)) {
			
		System.out.println("Treno Invertito! Si riparte!");
		Collections.reverse(composition);
			
		}else{throw new NoDoubleHeaderException(":UnableToReverse");}
		
	}
	
	public void isTowable() throws Throwable {
		
		if(composition.get(0).getPower() > composition.get(0).getWeight()) {
			System.out.println("isTrowable!");
		}
		else { throw new Throwable("train.IsNotTrowableException"); }
		
	}

	public void deleteAll(Train train) {
		
				composition.removeAll(composition);
		
	}
	
	public void deleteWagon(int i) {
		try {
			Object b = (i > -1) ? composition.remove(i):"OoB";
				b = (b != "OoB") ? "Removed":"Not Removed!";
				System.out.println(b);
		} catch (Throwable t) {
			System.out.print("Wagon Not Removed! | ");
			// System.out.println(t.getCause());
			System.out.println(t.getMessage());
			// t.printStackTrace();
		} finally {
		}
	}
}
