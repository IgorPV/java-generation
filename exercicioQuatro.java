package ExerciciosJava;

import java.util.Scanner;
public class exercicioQuatro {

	public static void main(String[] args) {
		
		int D,A,B,C;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o número A: ");
		A = ler.nextInt();
		System.out.println("Entre com o número B: ");
		B = ler.nextInt();
		System.out.println("Entre com o número C: ");
		C = ler.nextInt();
		
		D = ((A*A+2*A*B+B*B)+(B*B+2*B*C+C*C))/2;
		System.out.println("O valor de D é: "+ D);
	
	
		
	}
	
}
