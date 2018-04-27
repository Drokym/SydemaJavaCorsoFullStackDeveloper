package persone;

public class Pensionato implements Persona{
	
	Persona persona;
	private double pensione;
	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Pensionato(Persona persona, double pensione) {
		super();
		this.persona=persona; 
		this.pensione = pensione;
	}
	
	public Pensionato() {
		super();
	}


	public Pensionato(Persona persona) {
		super();
		this.persona = persona;
	}
	
	public double getPensione() {
		return pensione;
	}

	public void setPensione(double pensione) {
		this.pensione = pensione;
	}
	
public String toString() {
		
		String s = persona.toString(); 
		
		s = s + "\n è "+ this.getClass().getSimpleName();
		s = s + " con pensione " + pensione; 

		return s ;
	} 
}