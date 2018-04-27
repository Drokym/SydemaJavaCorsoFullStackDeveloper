package caffe;

public abstract class CaffeBase implements Caffe{
	protected String blend;
	
	public CaffeBase(String blend) {
		this.blend = blend;
	}
	public String getBlend() {
		return blend;
	}
	public void setBlend(String blend) {
		this.blend = blend;
	}
	
}
