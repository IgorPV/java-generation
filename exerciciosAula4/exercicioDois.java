package exerciciosAula4;
/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

import java.util.*;

public class exercicioDois {
	public static void main(String[] args) {
		int num[] = new int[6], somapar=0, contimpar=0 ,x;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 6 valores inteiros: ");
		for(x=0;x<6;x++) {
			num[x] = ler.nextInt();
			if(num[x]%2==0) {
				somapar += num[x];
			} else {
				contimpar++;
			}
			
		}
		
		for(x=0;x<6;x++) {
			
			if(num[x]%2==0) {
				System.out.println("O n�mero "+num[x]+" � par");
			} else {
				System.out.println("O n�mero "+num[x]+" � �mpar");
			}
			
			
		}
		System.out.println("A soma dos pares �: "+somapar);
		System.out.println("A quantidade de �mpares �: "+contimpar);
		
		
		
	}
	
	
	
}
