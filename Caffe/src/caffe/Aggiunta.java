package caffe;

public class Aggiunta {
	private String alcolico;
	private Double zucchero;
	private Double alcolicoQuantity;
	
	public Aggiunta(String alcolico, Double zucchero, Double alcolicoQuantity) {
		this.alcolico = alcolico;
		this.zucchero = zucchero;
		this.alcolicoQuantity = alcolicoQuantity;
	}

	public Aggiunta(String alcolico, Double alcolicoQuantity) {
		this.alcolico = alcolico;
		this.alcolicoQuantity = alcolicoQuantity;
	}

	public Aggiunta(Double zucchero) {
		this.zucchero = zucchero;
	}

	public Aggiunta() {
	}

	public String getAlcolico() {
		return alcolico;
	}

	public void setAlcolico(String alcolico) {
		this.alcolico = alcolico;
	}

	public Double getZucchero() {
		return zucchero;
	}

	public void setZucchero(Double zucchero) {
		this.zucchero = zucchero;
	}

	public Double getAlcolicoQuantity() {
		return alcolicoQuantity;
	}

	public void setAlcolicoQuantity(Double alcolicoQuantity) {
		this.alcolicoQuantity = alcolicoQuantity;
	}
	
}
