package train.factory;

public abstract class BasicWagon implements Wagon{
	
	Wagon wagon;
	protected Double weight;
	protected String compositeWagon;

	@Override
	public String toString() {
		//System.out.println("<test>"+compositeWagon+"</test>");
		return compositeWagon;
	}
	
	public Double getWeight() {
		return weight;
	}
	

}
