package ExerciciosAula6;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String n, String e, String t){
	
		setNome(n);
		setEndereco(e);
		setTelefone(t);
	
	}

	public Pessoa(String nome, String telefone) {
		
		setNome(nome);
		setTelefone(telefone);
		
	}
	
	public Pessoa(String nome) {
		
		setNome(nome);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
