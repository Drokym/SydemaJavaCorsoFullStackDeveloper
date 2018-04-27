package test;

import persone.*;
/*import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;*/
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personaTests {
   public static void main(String[] args) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("persona.xml");
      
      Persona persona = context.getBean("osp", Persona.class);
      System.out.println(persona.toString());
      context.close();
   }
}