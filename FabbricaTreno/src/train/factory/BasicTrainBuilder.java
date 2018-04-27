package train.factory;

public abstract class BasicTrainBuilder implements TrainBuilder{
	
	protected abstract Wagon buildHeader();
	protected abstract Wagon buildHeader(Double power,Double weight);
	protected abstract Wagon buildCargo();
	protected abstract Wagon buildCargo(Double weight);
	protected abstract Wagon buildPassenger();
	protected abstract Wagon buildPassenger(Double weight);
	protected abstract Wagon buildRestaurant();
	protected abstract Wagon buildRestaurant(Double weight);
	@Override
	public Train buildTrain(String train) throws Throwable {
		
		Train trainComposition = new Train();
		
		train = train.toLowerCase();
		//System.out.println(train);
		//Check if String StartWith Header
		if(train.startsWith("h"))
			trainComposition.addWagon(buildHeader(999.0,81.0));
		else if(train.startsWith("z"))
			trainComposition.addWagon(new Header(new Passenger(buildCargo())));
		else throw new Throwable("trainBuilder.NoHeaderException"); 
		
		char[] c = train.toCharArray();
		
		for(int i =1; i < c.length;i++) {
			switch(c[i]) {
			case 'r':trainComposition.addWagon(buildRestaurant());break;
			case 'h':trainComposition.addWagon(buildHeader()); break;
			case 'p':trainComposition.addWagon(buildPassenger()); break;
			case 'c':trainComposition.addWagon(buildCargo()); break;
			case 'z':trainComposition.addWagon(new Header(new Passenger(buildCargo()))); break;
			case 'k':trainComposition.addWagon(new Restaurant(buildPassenger())); break;
			default: throw new Throwable(this.getClass().getSimpleName()+" : "+"trainBuilder.WrongBuildedStringException");
			}
		}
		return trainComposition;
		
		
	}

	
}
