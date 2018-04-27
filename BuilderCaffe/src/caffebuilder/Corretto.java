package caffebuilder;

public class Corretto extends CaffeBuilder{

	@Override
	public void buildAlcool() {
		System.out.println("Sambuca");
		
	}

	@Override
	public void buildSugar() {
		System.out.println("Normal sugar");
		
	}

	@Override
	public void buildMilk() {
		System.out.println("Some milk\n----------------");
	}

}
