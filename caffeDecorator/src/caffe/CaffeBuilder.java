package caffe;

import java.util.Collection;

public abstract class CaffeBuilder implements CaffeBase {
	
	protected static Caffe buildCorrezione(Caffe c) {
		// TODO Auto-generated method stub
		return null;
	}
	protected static Collection <Corretto> getCorrezione() {
		// TODO Auto-generated method stub
		return null;
	}
	protected abstract Caffe buildCaffeBase();
	
	public static Caffe getCaffe() {
		Caffe caffe = new Espresso();
			//for (Caffe c: getCorrezione())
					//buildCorrezione(c);
			
			return caffe;
	}
	
	
	/*public static Caffe getCaffe() {
		
		Caffe espresso = new Espresso();
		System.out.println(espresso.prepara());
		Caffe corretto = new Corretto(espresso);
		System.out.println(corretto.prepara());
		Caffe piuLatte = new AggiuntaLatte(corretto);
		Caffe piuLatte2 = new AggiuntaLatte(piuLatte);
		System.out.println(piuLatte2.prepara());
		
		return espresso;
		
	}*/

}
