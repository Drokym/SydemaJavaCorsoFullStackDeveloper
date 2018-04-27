package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import train.factory.*;

public class treniTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("train.xml");

		Train train = context.getBean("italoTrain", Train.class);
		System.out.println(train.toString());
		System.out.println(train.stampWagon(1));
		context.close();

	}
}
