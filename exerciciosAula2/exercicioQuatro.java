package exerciciosAula2;
/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
import java.util.*;

public class exercicioQuatro {
	public static void main(String[] args) {
			double num, res;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Entre com o número:");
			num = ler.nextInt();
			
			if(num%2==0) {
				System.out.println("Esse número é par");
				res = Math.sqrt(num);
				System.out.printf("A raiz quadrada do número é %.2f", res);
			} else {
				System.out.println("Esse número é ímpar");
				res = Math.pow(num, 2);
				System.out.printf("O número elevado ao quadrado é %.2f", res);
			}
			
	}
}
