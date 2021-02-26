package exerciciosAula3;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class exercicioSeis {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num, soma = 0, cont = 0, media;

		System.out.println("Entre com um número: ");
		num = ler.nextInt();

		do {
			if (num != 0) {
				if (num % 3 == 0) {
					soma += num;
					cont++;
				}
			}
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
		} while (num != 0);

		if (cont == 0) {
			System.out.println("Não há divisão por zero!");
		} else {
			media = soma / cont;

			System.out.println("A média dos múltiplos de 3 é: " + media);
		}
	}

}
