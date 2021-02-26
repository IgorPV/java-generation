package exerciciosAula3;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/
public class exercicioDois {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num,contpar=0,contimpar=0;

		for (int x = 1; x <= 10; x++) {
				System.out.println("Entre com um número:");
				num = ler.nextInt();
				if (num%2==0) {
					contpar++;
				}
				else {
					contimpar++;
				}
		}
		
		System.out.printf("A quantidade de pares é : %d \nA quantidade de ímpares é : %d",contpar,contimpar);
		
	}
}
