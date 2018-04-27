package persone;

public class PensionatoBase extends Persona implements Pensionato {

	private double pensione;
	
	public PensionatoBase(String nome, String cognome, double pensione) {
		super();
		this.cognome=cognome; 
		this.nome=nome;
		this.pensione = pensione;
	}

	@Override
	public double getPensione() {
		return pensione;
	}

	@Override
	public void setPensione(double pensione) {
		this.pensione = pensione;
		
	}
	
	@Override
	public String toString() {
		return "Pensionato [nome=" + nome + ", cognome=" + cognome + ", pensione=" + pensione + "]";
	} 

}
