package train.factory;

public class Passenger extends BasicWagon {

	Passenger(){
		compositeWagon=this.getClass().getSimpleName();
	}
	
	Passenger(Wagon wagon){
		
		this.wagon = wagon;
		compositeWagon = this.wagon.toString()+ " + "+ this.getClass().getSimpleName(); 
	}
	
	public Passenger(Double weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	@Override
	public Double getPower() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	

}
