package exerciciosAula3;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class exercicioSeis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, soma = 0, cont = 0, media;

		System.out.println("Entre com um n�mero: ");
		num = ler.nextInt();

		do {
			if (num != 0) {
				if (num % 3 == 0) {
					soma += num;
					cont++;
				}
			}
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
		} while (num != 0);

		if (cont == 0) {
			System.out.println("N�o h� divis�o por zero!");
		} else {
			media = soma / cont;

			System.out.println("A m�dia dos m�ltiplos de 3 �: " + media);
		}
	}

}
