package exerciciosAula4;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/
public class exercicioQuatro {
	public static void main(String[] args) {
		float m1[][] = new float[2][2], m2[][] = new float[2][2], m3[][] = new float[2][2], cons;
		int l, c, op;
		Scanner ler = new Scanner(System.in);
		
		for (l = 0; l < 2; l++) {  //lendo a primeira matriz
			for (c = 0; c < 2; c++) {
				System.out.printf("Entre com o valor m1[%d][%d]", l + 1, c + 1);
				m1[l][c] = ler.nextFloat();
			}
		}
		for (l = 0; l < 2; l++) { //lendo a segunda matriz
			for (c = 0; c < 2; c++) {
				System.out.printf("Entre com o valor m2[%d][%d]", l + 1, c + 1);
				m2[l][c] = ler.nextFloat();
			}
		}

		System.out.println("Entre com a operação:\n1 -- Somar as matrizes\n2 -- Subtrair m1 de m2\n3 -- Somar uma constante as matrizes\n4 -- imprimir m1 e m2");
		op = ler.nextInt(); //lendo a operação
		while (op < 1 || op > 4) { //repetição para garantir a entrada correta
			System.out.println(
					"Entre com a operação:\n1 -- Somar as matrizes\n2 -- Subtrair m1 de m2\n3 -- Somar uma constante as matrizes\n4 -- imprimir m1 e m2");
			op = ler.nextInt();
		}

		switch (op) { //definir a operação caso a caso

		case 1: 
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					m3[l][c] = m1[l][c] + m2[l][c];
					System.out.println(m3[l][c]);
				}
			}break;
		
		case 2:
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					m3[l][c] = m2[l][c] - m1[l][c];
					System.out.println(m3[l][c]);
				}
			}break;
			
		case 3:	
			System.out.println("Entre com um valor de constante: ");
			cons = ler.nextFloat();
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					m1[l][c] = cons+m1[l][c];
					m2[l][c] = cons+m2[l][c];
				}
			}
			System.out.println("Matriz 1:");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(m1[l][c]+" ");
				}
				System.out.println();
			}
			System.out.println("Matriz 2:");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(m2[l][c]+" ");
				}
				System.out.println();
				
			} break;
		case 4:
			System.out.println("Matriz 1:");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(m1[l][c]+" ");
				}
				System.out.println();
			}
			System.out.println("Matriz 2:");
			for (l = 0; l < 2; l++) {
				for (c = 0; c < 2; c++) {
					System.out.print(m2[l][c]+ " ");
				}
				System.out.println();
			}break;
			
		}
	}
}
