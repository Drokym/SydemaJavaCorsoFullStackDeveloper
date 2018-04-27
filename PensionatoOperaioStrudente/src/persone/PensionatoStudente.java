package persone;

import CommonsUtility.StudenteUtility;

public class PensionatoStudente extends Persona implements Pensionato, Studente {

	private String matricola;
	private double pensione;
	public String getMatricola() {
		return matricola;
	}
	public PensionatoStudente(String nome, String cognome,String matricola, double pensione) {
		super();
		this.cognome=cognome; 
		this.nome=nome;
		this.matricola = matricola;
		this.pensione = pensione;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public double getPensione() {
		return pensione;
	}
	@Override
	public String toString() {
		return "StudenteOperaio [ nome=" + nome + ", cognome="
				+ cognome + " matricola=" + matricola + ", pensione=" + pensione +"]";
	}
	public void setPensione(double pensione) {
		this.pensione = pensione;
	}
	@Override
	public float mediaVoti() {
		//StudenteUtility su = new StudenteUtility();
		return StudenteUtility.calcolaMediaVoti(this);
	}
}
