package persone;

import CommonsUtility.StudenteUtility;

public class StudenteBase extends Persona implements Studente {

	private String matricola;

	
	public StudenteBase(String nome, String cognome, String matricola) {
		super();
		this.cognome=cognome; 
		this.nome=nome;
		this.matricola = matricola;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	/*
	@Override
	public float mediaVoti() {
		System.out.println("metodo lungo e complicato");
		return 0;
	}
	*/
	@Override
	public float mediaVoti() {
		//StudenteUtility su = new StudenteUtility();
		return StudenteUtility.calcolaMediaVoti(this);
	}
	
}
