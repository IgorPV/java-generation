package ExercicioAula7;

public abstract class Animal {
	String nome;
	int idade;
	String som;
	
	public Animal(String nome, int idade, String som) {
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		
	}
	
	abstract public void imprimeSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	
	
}
