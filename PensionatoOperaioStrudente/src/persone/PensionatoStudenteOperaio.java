package persone;

public class PensionatoStudenteOperaio extends Persona implements Pensionato, Operaio, Studente {

	private String matricola;
	private double pensione;
	private double stipendio;
	public PensionatoStudenteOperaio(String nome, String cognome, String matricola, double pensione, double stipendio) {
		this.cognome=cognome; 
		this.nome=nome;
		this.matricola = matricola;
		this.pensione = pensione;
		this.stipendio = stipendio;
	}
	@Override
	public String getMatricola() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setMatricola(String matricola) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float mediaVoti() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getPensione() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setPensione(double salario) {
		// TODO Auto-generated method stub
		
	}

}
