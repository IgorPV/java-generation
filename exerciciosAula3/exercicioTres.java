package exerciciosAula3;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
public class exercicioTres {
	public static void main(String[] args) {
		
		
		int num,  cont21=0 , cont50=0 ;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a idade: ");
		num = ler.nextInt();
		
		while (num!=-99) { //laço para controlar a quantidade de entradas
			if (num<=21) { //condicional para analisar os contadores
				cont21++;
			}
			else if(num>=51) { //condicional para analisar os contadores
				cont50++;
			}
			System.out.println("Entre com a idade: ");
			num = ler.nextInt();
		}
		System.out.printf("A quantidade de pessoas com menos de 21 anos é %d\nAquantidade de pessoas com mais de 50 anos é de %d",cont21,cont50);
		
	}
}
