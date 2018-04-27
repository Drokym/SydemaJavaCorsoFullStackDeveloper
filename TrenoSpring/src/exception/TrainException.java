package exception;

public class TrainException extends Exception {

	private static final long serialVersionUID = 1L;

	public TrainException() {
		// TODO Auto-generated constructor stub
	}

	public TrainException(String arg0) {
		super("TrainException" + arg0);
		// TODO Auto-generated constructor stub
	}

	public TrainException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TrainException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public TrainException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
