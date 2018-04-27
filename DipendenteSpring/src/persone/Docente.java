package persone;

public class Docente implements Persona{
	
	Persona persona;
	private double salario; 
	
	public Docente() {
		super();
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Docente(Persona persona, double salario) {
		super();
		this.persona=persona; 
		this.salario = salario;
	}
	
	
	public Docente(Persona persona) {
		super();
		this.persona = persona;
	}
	
	public double getPensione() {
		return salario;
	}

	public void setPensione(double salario) {
		this.salario = salario;
	}
	
public String toString() {
		
		String s = persona.toString(); 
		
		s = s + "\n è "+ this.getClass().getSimpleName();
		s = s + " con salario " + salario; 

		return s ;
	} 
}
