package persone;

public class OperaioBase extends Persona implements Operaio{

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public OperaioBase(String nome, String cognome, double salario) {
		super();
		this.cognome=cognome; 
		this.nome=nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Operaio [nome=" + nome + ", cognome=" + cognome + ", salario=" + salario + "]";
	} 
}
