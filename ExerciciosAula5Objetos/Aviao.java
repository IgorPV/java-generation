package ExerciciosAula5Objetos;

import java.util.Scanner;

public class Aviao {
	
	private String modelo;
	private int capacidade;
	private String ciaAerea;
	
	Scanner ler = new Scanner(System.in);
	//criando construtor
	public Aviao(String modelo, int capacidade, String ciaAerea) { 
		
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.ciaAerea = ciaAerea;
	
	}
	//criando métodos
	public void lotacao(int passageiros) {
		 
		 if (this.capacidade>passageiros) {
			 System.out.println("O avião ainda tem "+(this.capacidade-passageiros)+" vagas");
		 }else if(this.capacidade == passageiros) {
			 System.out.println("Este avião não tem mais vagas! ");
		 }else {
			 System.out.println("ALERTA! Este vôo está com overbooking!"+
					 "\nO avião "+this.modelo+" só possui "+this.capacidade+" de vagas!");
		 }
		
	}
	
	
	
	
}
