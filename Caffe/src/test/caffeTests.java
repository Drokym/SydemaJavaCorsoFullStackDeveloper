package test;

import preparatore.MacchinaCaffe;
import caffe.*;

public class caffeTests {

	public static void main(String[] args) {
		
		Aggiunta aggiunta= new Aggiunta(2.0);
		Caffe lungo = new Lungo("Arabica");
		Caffe espresso = new Espresso("Arabica");
		Caffe ristretto = new Ristretto("Arabica");
		Caffe decaffeinato = new Decaffeinato("Arabica");
		
		MacchinaCaffe macchinaCaffe = new MacchinaCaffe(lungo, aggiunta);
		
		System.out.println(macchinaCaffe.prepara("Cappuccino"));
		
	}

}
