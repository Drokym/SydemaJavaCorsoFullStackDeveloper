package caffe;

public class AggiuntaLatte extends CaffeDecorator{
	
	public AggiuntaLatte(Caffe caffe){
		this.caffe = caffe;
	}
	
	public String toString() {
		return caffe.prepara()+ this.getClass().getSimpleName();
	}

}
