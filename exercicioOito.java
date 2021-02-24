package ExerciciosJava;

import java.util.Scanner;
public class exercicioOito {

	public static void main(String[] args) {
		
		float custoCons, custoFab;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o custo de fábrica:");
		
		custoFab = ler.nextFloat();
		
		custoCons = (float) (1.732)*custoFab;
		
		System.out.println("O custo para o consumidor é de R$"+ custoCons);
		
	}
	
}
