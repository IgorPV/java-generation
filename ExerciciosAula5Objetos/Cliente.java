package ExerciciosAula5Objetos;

import java.util.Scanner;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


public class Cliente {
	
	//definindo atributos da classe
	private String nomePrincipal;
	private String nomeFinal;
	private int idade;
	private String cpf;
	
	Scanner ler = new Scanner(System.in); //definindo o objeto ler para executar entrada de dados
	
	
	//definindo os métodos a serem utilizados
	public void setNomePrincipal() {
		String nome;
		System.out.println("Insira o primeiro nome do cliente: ");
		nome = ler.nextLine();
		this.nomePrincipal = nome;
	}
	
	public void setNomeFinal() {
		String nome;
		System.out.println("Insira o último nome do cliente: ");
		nome = ler.nextLine();
		this.nomeFinal = nome;
	}
	
	public void setIdade() {
		int idade;
		System.out.println("Insira a idade do cliente: ");
		idade = ler.nextInt();
		this.idade = idade;
	}
	
	public void setCPF() {
		String cpf;
		ler.nextLine();
		System.out.println("Insira o Cpf do cliente (usando . e -): ");
		cpf = ler.nextLine();
		this.cpf = cpf;
	}
	
	public void infoCliente() {
		System.out.println("O cliente se chama "+this.nomePrincipal+" "+this.nomeFinal
				+"\nO cliente tem CPF: "+this.cpf+ "\nA idade do cliente é: "+this.idade);
	}
	
}
