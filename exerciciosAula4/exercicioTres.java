package exerciciosAula4;
/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
import java.util.Scanner;

public class exercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] = new int[3][3],l,c,cont10=0;
		Scanner ler = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.printf("Entre com o valor da posição M[%d][%d]",l+1,c+1);
				M[l][c] = ler.nextInt();
				if(M[l][c]>10) {
					cont10++;
				}
			}
		}
		
		System.out.println("A matriz possui "+cont10+" valores maiores que 10");
		
	}

}
