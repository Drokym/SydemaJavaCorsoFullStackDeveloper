package caffe;

public class Espresso implements Caffe{
	
	@Override
	public String prepara() {
		return this.getClass().getSimpleName();
	}


}
