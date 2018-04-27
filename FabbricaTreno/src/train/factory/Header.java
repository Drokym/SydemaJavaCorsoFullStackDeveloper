package train.factory;

public class Header extends BasicWagon implements Driving{
	
	protected Double power;

	public Header(){
		compositeWagon=this.getClass().getSimpleName();
	}

	public Header(Double power, Double weight) {
		this.power = power;
		this.weight = weight;
		compositeWagon=this.getClass().getSimpleName();
	}
	
public Header(Wagon wagon){
		
		this.wagon = wagon;
		compositeWagon = this.wagon.toString()+ " + "+ this.getClass().getSimpleName(); 
	}
	
	@Override
	public Double getPower() {
		return power;
	}

}
