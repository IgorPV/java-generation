package exerciciosAula3;

import java.util.Scanner;

public class exercicioQuatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, totcalm = 0, homagr = 0, munerv = 0, outcalm = 0, nerv40 = 0, calm18 = 0, i = 0, gen, temp;

		while (i < 150) { // la�o para o tamanho do conjunto de dados

			System.out.println("entre com a idade: ");
			idade = ler.nextInt();
			while (idade < 1 || idade > 120) {
				System.out.println("entre com a idade: ");
				idade = ler.nextInt();
			}
			System.out.println("Entre com 1 para masculino, 2 para feminino, 3 para Outros");
			gen = ler.nextInt();
			while (gen < 1 || gen > 3) {
				System.out.println("Entre com 1 para masculino, 2 para feminino, 3 para Outros");
				gen = ler.nextInt();
			}
			System.out.println("Entre com 1 para calma, 2 para nervosa, 3 para agressiva");
			temp = ler.nextInt();
			while (temp < 1 || temp > 3) {
				System.out.println("Entre com 1 para calma, 2 para nervosa, 3 para agressiva");
				temp = ler.nextInt();
			}
			if (temp == 1) { // condicional para verificar pessoas calmas
				totcalm++;
			}
			if (idade >= 40 && temp == 2) { // contando maiores de 40 anos nervosos
				nerv40++;
			}
			if (idade <= 18 && temp == 1) { // contando menores de 18 anos calmos
				calm18++;
			}
			switch (gen) { // verificando as respostas para g�nero
			case 1:
				if (temp == 3) { // contando homens agressivos
					homagr++;
				}
			case 2:
				if (temp == 2) { // contando mulheres nervosas
					munerv++;
				}
			case 3:
				if (temp == 1) { // contando outros calmos
					outcalm++;
				}
			}

			i++; // incremento para repeti��o do while

		}

		System.out.println("O n�mero de pessoas calmas �:" + totcalm + "\nO n�mero de homens agressivos �: " + homagr
				+ "\nO n�mero de mulheres nervosas �: " + munerv + "\nO n�mero de Outros calmos �: " + outcalm
				+ "\nO n�mero de nervosos acima dos 40 �:" + nerv40 + "\nO n�mero de calmos abaixo dos 18 �:" + calm18);

	}
}
