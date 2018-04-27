package test;

import caffe.*;
/*import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;*/
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCaffe {
   public static void main(String[] args) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("caffe.xml");
      
      Caffe caffe = context.getBean("correttoMoka", Caffe.class);
      System.out.println(caffe.prepara());
      context.close();
   }
}