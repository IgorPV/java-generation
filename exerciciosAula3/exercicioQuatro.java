package exerciciosAula3;

import java.util.Scanner;

public class exercicioQuatro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, totcalm = 0, homagr = 0, munerv = 0, outcalm = 0, nerv40 = 0, calm18 = 0, i = 0, gen, temp;

		while (i < 150) { // laço para o tamanho do conjunto de dados

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
			switch (gen) { // verificando as respostas para gênero
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

			i++; // incremento para repetição do while

		}

		System.out.println("O número de pessoas calmas é:" + totcalm + "\nO número de homens agressivos é: " + homagr
				+ "\nO número de mulheres nervosas é: " + munerv + "\nO número de Outros calmos é: " + outcalm
				+ "\nO número de nervosos acima dos 40 é:" + nerv40 + "\nO número de calmos abaixo dos 18 é:" + calm18);

	}
}
