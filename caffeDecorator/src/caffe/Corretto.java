package caffe;

public class Corretto extends CaffeDecorator{
	
	public Corretto(Caffe caffe){
		this.caffe = caffe;
	}
	
	public String toString() {
		return caffe.prepara() + this.getClass().getSimpleName();
	}


}
