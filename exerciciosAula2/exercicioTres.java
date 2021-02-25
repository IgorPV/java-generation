package exerciciosAula2;
import java.util.*;
public class exercicioTres {
public static void main(String[] args) {
	int idade;

	Scanner leia = new Scanner(System.in);
	
	System.out.println("Entre com a idade: ");
	idade = leia.nextInt();
	
	if(idade<=14 && idade>=10) {
		System.out.println("Você está na categoria Infantil");
	} else if(idade>=15 && idade<=17) {
		System.out.println("Você está na categoria Juvenil");
	} else if(idade>=18 && idade<=25) {
		System.out.println("Você está na categoria Adulto");
	} else {
		System.out.println("Você não está em nenhuma categoria!");
	}
	
}
}
