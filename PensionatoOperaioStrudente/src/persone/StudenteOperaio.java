package persone;

import CommonsUtility.StudenteUtility;

public class StudenteOperaio extends Persona implements Operaio, Studente {

	private String matricola;
	private double salario;
	public String getMatricola() {
		return matricola;
	}
	public StudenteOperaio(String nome, String cognome,String matricola, double salario) {
		super();
		this.cognome=cognome; 
		this.nome=nome;
		this.matricola = matricola;
		this.salario = salario;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public double getSalario() {
		return salario;
	}
	@Override
	public String toString() {
		return "StudenteOperaio [ nome=" + nome + ", cognome="
				+ cognome + " matricola=" + matricola + ", salario=" + salario +"]";
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public float mediaVoti() {
		//StudenteUtility su = new StudenteUtility();
		return StudenteUtility.calcolaMediaVoti(this);
	}
	

}
