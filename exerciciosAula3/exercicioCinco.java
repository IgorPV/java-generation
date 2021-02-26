package exerciciosAula3;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.*/
import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("Entre com um número: ");
		num = ler.nextInt();
		
		do {
			soma+=num;
			System.out.println("Entre com um número: ");
			num = ler.nextInt();
		}while(num!=0);
		
		System.out.println("A soma dos valores informados é: "+soma);
		
		
		
		
		

	}

}
