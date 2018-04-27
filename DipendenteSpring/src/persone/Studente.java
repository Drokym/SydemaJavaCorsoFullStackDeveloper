package persone;

public class Studente implements Persona{
	
	Persona persona;
	private String matricola; 
	
	public Studente() {
		
	}

	@Override
	public String toString() {
		
		String s = persona.toString(); 
		
		s = s + "\n è "+ this.getClass().getSimpleName();
		s = s + " con matricola " + matricola; 

		return s ;
	} 
	

	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Studente(Persona persona) {
		super();
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
