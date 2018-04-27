package preparatore;

import caffe.*;

public class MacchinaCaffe {
	
	Caffe caffe;
	Aggiunta aggiunta;
	
	public MacchinaCaffe(Caffe caffe, Aggiunta aggiunta) {
		this.caffe = caffe;
		this.aggiunta = aggiunta;
	}

	public String prepara(String tipoCaffe) {
		if(tipoCaffe=="Cappuccino" || tipoCaffe=="cappuccino")
			return "MacchinaCaffe [caffe=" + caffe.getClass().getSimpleName() + ", corretto con=" + aggiunta.getAlcolico()+", zucchero=" + aggiunta.getZucchero()+"g]";
		else
			return "MacchinaCaffe [caffe=" + caffe.getClass().getSimpleName() + ", aggiunta=" + aggiunta.getAlcolico()+", aggiunta=" + aggiunta.getZucchero()+"]";

		}

}
