package ExerciciosAula5Objetos;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao avi = new Aviao ("Boeing",747,"TAM"); //definindo objeto para análise
		int passageiros; 
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com a quantidade de passageiros "); //pessoas que já compraram passagem
		passageiros = ler.nextInt();
		avi.lotacao(passageiros);
		
		
		
	}

}
