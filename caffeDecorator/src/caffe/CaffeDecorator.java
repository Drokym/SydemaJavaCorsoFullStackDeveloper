package caffe;

public abstract class CaffeDecorator implements Caffe{
	
	Caffe caffe;

	@Override
	public final String prepara() {
		return toString();
	}

}
