package ExerciciosJava;

import java.util.Scanner;

public class exercicioDois {
	public static void main(String[] args) {
		
		int dias, meses, anos, diasTotais;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade em dias: ");
		diasTotais = ler.nextInt();
		
		anos = diasTotais/365;
		meses = (diasTotais%365)/30;
		dias = (diasTotais%365)%30;
		
		System.out.println("Sua idade é :"+ anos+ " anos, "+ meses +" meses e "+ dias +" dias");
		
	}
}
