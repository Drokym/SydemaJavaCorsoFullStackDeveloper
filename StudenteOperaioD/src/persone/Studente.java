package persone;

public class Studente implements Persona{
	
	Persona persona;
	private String matricola; 
	
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

	

}
