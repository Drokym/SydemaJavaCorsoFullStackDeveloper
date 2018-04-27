package persone;

public class Operaio implements Persona{
	
	Persona persona;
	private double salario; 
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}



	

	@Override
	public String toString() {
		
		String s = persona.toString(); 
		
		s = s + "\n è "+ this.getClass().getSimpleName();
		s = s + " con salario " + salario; 

		return s ;
	} 
	
	public Operaio(Persona persona, double salario) {
		super();
		this.persona=persona; 
		this.salario = salario;
	}
	
	
	public Operaio(Persona persona) {
		super();
		this.persona = persona;
	}

	
}
