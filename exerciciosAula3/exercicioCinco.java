package exerciciosAula3;
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.*/
import java.util.Scanner;

public class exercicioCinco {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		
		int num,soma=0;
		
		System.out.println("Entre com um n�mero: ");
		num = ler.nextInt();
		
		do {
			soma+=num;
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
		}while(num!=0);
		
		System.out.println("A soma dos valores informados �: "+soma);
		
		
		
		
		

	}

}
