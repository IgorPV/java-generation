package exerciciosAula4;
/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

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
				System.out.println("O número "+num[x]+" é par");
			} else {
				System.out.println("O número "+num[x]+" é ímpar");
			}
			
			
		}
		System.out.println("A soma dos pares é: "+somapar);
		System.out.println("A quantidade de ímpares é: "+contimpar);
		
		
		
	}
	
	
	
}
