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
	//criando m�todos
	public void lotacao(int passageiros) {
		 
		 if (this.capacidade>passageiros) {
			 System.out.println("O avi�o ainda tem "+(this.capacidade-passageiros)+" vagas");
		 }else if(this.capacidade == passageiros) {
			 System.out.println("Este avi�o n�o tem mais vagas! ");
		 }else {
			 System.out.println("ALERTA! Este v�o est� com overbooking!"+
					 "\nO avi�o "+this.modelo+" s� possui "+this.capacidade+" de vagas!");
		 }
		
	}
	
	
	
	
}
