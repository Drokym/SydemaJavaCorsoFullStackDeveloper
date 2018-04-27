package test;

import train.factory.*;

public class treniTest {

	public static void main(String[] args) {
		// TODO Hello
		TrainBuilder builder = new ItaloBuilder();
		Train trenoNuovo = null;
		try {
			//trenoNuovo.isBlank();
			trenoNuovo = builder.buildTrain("hpppkkk");
			trenoNuovo.isTowable();
			System.out.println(trenoNuovo.toString());
			System.out.println(trenoNuovo.stampWagon(0));
			trenoNuovo.turnTrain();
			trenoNuovo.deleteWagon(0);
			System.out.println(trenoNuovo.toString());
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
