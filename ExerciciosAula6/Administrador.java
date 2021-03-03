package ExerciciosAula6;

import java.util.Scanner;

public class Administrador extends Pessoa {

	private float ajudaDeCusto;
	
	Scanner ler = new Scanner(System.in);
	
	public Administrador (String nome, String telefone) {
		super(nome,telefone);
	}
	
	public void setAjudaDeCusto() {
		
		System.out.println("Entre com a ajuda de custo: ");
		this.ajudaDeCusto = ler.nextFloat();
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	
	
}
