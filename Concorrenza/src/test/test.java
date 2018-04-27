package test;
import thread.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		t1.run();
		t2.run();
		
	}

}
