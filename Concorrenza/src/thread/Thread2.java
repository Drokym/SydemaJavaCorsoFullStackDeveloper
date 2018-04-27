package thread;

public class Thread2 extends Thread {

	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("Thread2= "+i);
			try {
				Thread.sleep(1);
			}catch(InterruptedException e){e.printStackTrace();}
		System.out.print("pippo ");
		}

	}

}
