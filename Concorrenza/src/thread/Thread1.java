package thread;

public class Thread1 extends Thread {

	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("Thread1= "+i);
			try {
				Thread.sleep(2);
			}catch(InterruptedException e){e.printStackTrace();}
		
		}

	}

}
