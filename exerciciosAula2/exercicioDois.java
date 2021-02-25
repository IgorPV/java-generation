package exerciciosAula2;

import java.util.*;

public class exercicioDois {

	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o número 1: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o número 2: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o número 3: ");
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.print(num3 + " " + num2 + " " + num1);
			} else {
				System.out.print(num2 + " " + num3 + " " + num1);
			}

		}
		if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.print(num3 + " " + num1 + " " + num2);
			} else {
				System.out.print(num1 + " " + num3 + " " + num2);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num2 > num1) {
				System.out.print(num1 + " " + num2 + " " + num3);
			} else {
				System.out.print(num1 + " " + num2 + " " + num3);
			}
		}

	}

}
