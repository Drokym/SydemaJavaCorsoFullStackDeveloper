package train.factory;

public class Cargo extends BasicWagon{
	Cargo(){
		compositeWagon=this.getClass().getSimpleName();
	}
	
	Cargo(Wagon wagon){
		
		this.wagon = wagon;
		compositeWagon = this.wagon.toString()+ " + "+ this.getClass().getSimpleName(); 
	}

	public Cargo(Double weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
		compositeWagon=this.getClass().getSimpleName();
	}

	@Override
	public Double getPower() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
}
