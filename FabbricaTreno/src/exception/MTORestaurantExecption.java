package exception;

public class MTORestaurantExecption extends TrainCompositionException {

	
	private static final long serialVersionUID = 1L;

	public MTORestaurantExecption() {
		// TODO Auto-generated constructor stub
	}

	public MTORestaurantExecption(String arg0) {
		super("MoreThenOneRestaurant" + arg0);
		// TODO Auto-generated constructor stub
	}

	public MTORestaurantExecption(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public MTORestaurantExecption(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public MTORestaurantExecption(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
