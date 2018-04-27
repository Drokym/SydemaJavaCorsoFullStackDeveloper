package persone;

public class PersonaBase implements Persona{
	protected String nome; 
	protected String cognome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " con nome=" + nome + ", cognome=" + cognome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getFullName() {
		return this.cognome + " " + this.nome;
	}
	
	public PersonaBase(String nome, String cognome) {
		this.cognome=cognome; 
		this.nome=nome;

	}
	
}
