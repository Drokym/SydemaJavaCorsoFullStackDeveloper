package test;

import caffebuilder.*;

public class testBuilder {

	public static void main(String[] args) {

		        Barman barman = new Barman();
		        CaffeBuilder corretto = new Corretto();
		        CaffeBuilder cappuccino = new Cappuccino();
		        
		        barman.setCaffeBuilder(corretto);
		        barman.constructCaffe();
		        
		        Caffe caffe = barman.getCaffe();
		        
		        barman.setCaffeBuilder(cappuccino);
		        barman.constructCaffe();
		        
		        caffe = barman.getCaffe();
		    

	}

}
