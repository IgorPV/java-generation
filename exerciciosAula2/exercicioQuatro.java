package exerciciosAula2;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
import java.util.*;

public class exercicioQuatro {
	public static void main(String[] args) {
			double num, res;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Entre com o n�mero:");
			num = ler.nextInt();
			
			if(num%2==0) {
				System.out.println("Esse n�mero � par");
				res = Math.sqrt(num);
				System.out.printf("A raiz quadrada do n�mero � %.2f", res);
			} else {
				System.out.println("Esse n�mero � �mpar");
				res = Math.pow(num, 2);
				System.out.printf("O n�mero elevado ao quadrado � %.2f", res);
			}
			
	}
}
