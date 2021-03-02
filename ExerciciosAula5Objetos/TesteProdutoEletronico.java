package ExerciciosAula5Objetos;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String marca,modelo;
		float preco,valor1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n--Entre com o modelo do produto:");
		modelo = ler.nextLine();
		
		System.out.println("\n--Entre com o marca do produto:");
		marca = ler.nextLine();
		
		System.out.println("\n--Entre com o valor do produto:");
		valor1 = ler.nextFloat();
		
		ProdutoEletronico prod = new ProdutoEletronico(modelo,marca,valor1);
		prod.infoProduto(); //cadastrando produto
		
		System.out.println("\n\n--Entre com o valor do produto na loja concorrente (conforme informado pelo cliente):");
		preco = ler.nextFloat();
		
		prod.comparaPreco(preco); //comparando o preço
		
	}

}
