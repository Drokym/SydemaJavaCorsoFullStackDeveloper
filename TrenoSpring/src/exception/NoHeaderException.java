package exception;

public class NoHeaderException extends TrainCompositionException {

	private static final long serialVersionUID = 1L;

	public NoHeaderException() {
		// TODO Auto-generated constructor stub
	}

	public NoHeaderException(String arg0) {
		super("NoHeaderException"+arg0);
		// TODO Auto-generated constructor stub
	}

	public NoHeaderException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public NoHeaderException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public NoHeaderException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
