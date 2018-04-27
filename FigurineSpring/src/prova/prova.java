package prova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import geometria.*;
import geometria.FiguraColorata.Colore;

public class prova {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("figure.property");

		Figura figura = context.getBean("stella", FiguraComposta.class);
		System.out.println(figura.calcolaArea());
		context.close();
	}

}
