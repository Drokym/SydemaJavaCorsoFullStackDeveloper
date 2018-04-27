package persone;

public class PensionatoOperaio extends Persona implements Pensionato, Operaio {
	
	private double salario;
	private double pensione;
	
	public PensionatoOperaio(double salario, double pensione) {
		this.salario = salario;
		this.pensione = pensione;
	}

	public double getSalario() {
		return salario;
	}
	@Override
	public String toString() {
		return "PensionatoOperaio [ nome=" + nome + ", cognome="
				+ cognome + " pensione=" + pensione + ", salario=" + salario +"]";
	}
	@Override
	public double getPensione() {
		return pensione;
	}

	@Override
	public void setPensione(double pensione) {
		this.pensione = pensione;
		
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
