package persone;

public abstract class Persona {
	protected String nome; 
	protected String cognome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
}
