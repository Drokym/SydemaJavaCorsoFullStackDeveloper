
public class exctep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double c = null;
		try {
			c = dividi(5.0,0.0);
			System.out.println("Il risultato e': " + c);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	private static Double dividi(Double i, Double j) throws Throwable{
		Double c = null;
		try {
			c = i/j;
		}catch(Throwable t) {
			c
		}
		return c;
	}

}
