package exerciciosAula3;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.*/

public class exercicioUm {

	public static void main(String[] args) {
		
		int num=1000;
		
		for(num=1000;num<=1999;num++) { //laço de repetição para avaliar os números caso a caso
			
			if(num%11==5) { //condicional para determinar se há resto 5 ao dividir por 11
				System.out.println(num+" ");
			}
			
		}
		
	}

}
