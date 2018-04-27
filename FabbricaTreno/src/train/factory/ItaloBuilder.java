package train.factory;

public class ItaloBuilder extends BasicTrainBuilder {

	@Override
	protected Header buildHeader() {
		return new Header();
	}
	
	@Override
	protected Cargo buildCargo(Double weight) {
		// TODO Auto-generated method stub
		return new Cargo(weight);
	}

	@Override
	protected Passenger buildPassenger(Double weight) {
		// TODO Auto-generated method stub
		return new Passenger(weight);
	}

	@Override
	protected Restaurant buildRestaurant(Double weight) {
		// TODO Auto-generated method stub
		return new Restaurant(weight);
	}

	@Override
	protected Header buildHeader(Double power, Double weight) {
		return new Header(power,weight);
	}

	@Override
	protected Cargo buildCargo() {
		// TODO Auto-generated method stub
		return new Cargo();
	}

	@Override
	protected Passenger buildPassenger() {
		// TODO Auto-generated method stub
		return new Passenger();
	}

	@Override
	protected Restaurant buildRestaurant() {
		// TODO Auto-generated method stub
		return new Restaurant();
	}
	
	

}
