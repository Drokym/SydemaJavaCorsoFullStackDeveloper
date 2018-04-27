package train.factory;

public class Restaurant extends BasicWagon{

	Restaurant(){
		compositeWagon=this.getClass().getSimpleName();
	}
	
	Restaurant(Wagon wagon){
		
		this.wagon = wagon;
		compositeWagon = this.wagon.toString()+ " + "+ this.getClass().getSimpleName(); 
	}

	public Restaurant(Double weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	@Override
	public Double getPower() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	
}
