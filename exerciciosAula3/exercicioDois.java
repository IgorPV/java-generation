package exerciciosAula3;

import java.util.Scanner;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/
public class exercicioDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num,contpar=0,contimpar=0;

		for (int x = 1; x <= 10; x++) {
				System.out.println("Entre com um n�mero:");
				num = ler.nextInt();
				if (num%2==0) {
					contpar++;
				}
				else {
					contimpar++;
				}
		}
		
		System.out.printf("A quantidade de pares � : %d \nA quantidade de �mpares � : %d",contpar,contimpar);
		
	}
}
