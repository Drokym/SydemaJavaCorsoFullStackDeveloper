package caffebuilder;

public class Cappuccino extends CaffeBuilder{

	public Cappuccino() {
	
		
		
	}
	@Override
	public void buildAlcool() {
		System.out.println("No alcool");
		
	}

	@Override
	public void buildSugar() {
		System.out.println("Normal sugar");
		
	}

	@Override
	public void buildMilk() {
		System.out.println("A lot of milk");
		
	}

}
