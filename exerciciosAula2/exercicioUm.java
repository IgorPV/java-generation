package exerciciosAula2;

import java.util.*;

public class exercicioUm {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		int num1, num2, num3;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o número 1: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o número 2: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o número 3: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.printf("O maior número é : %d", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("O maior número é : %d", num2);
		} else if (num3 > num1 && num3 > num2) {
			System.out.printf("O maior número é : %d", num3);
		}

	}

}
