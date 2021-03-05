package ExerciciosAula8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> estoque = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		String produto;
		int op;

		do {
			System.out.println("Entre com o comando :\n\t1--Cadastrar produto"
					+ "\n\t2--Remover produto\n\t3--Atualizar estoque\n\t"
					+ "4--Apresentar estoque atual\n\t0--Fechar programa (apresenta estoque em ordem alfabética)");
		
			op = ler.nextInt();

			switch (op) {

				case 1:{
					ler.nextLine();
					System.out.println("\nEntre com um produto: ");
					produto = ler.nextLine();
						if (produto.equals(null)) {
							System.out.println("\nProduto inválido, entre com o nome do produto:");
							produto = ler.nextLine();
							estoque.add(produto);
							break;
						} else {
							estoque.add(produto);
							break;
						}
				}		
				case 2:{
					ler.nextLine();
					System.out.println("\nEntre com um produto para ser removido: ");
					produto = ler.nextLine();
						if (estoque.contains(produto)) {
							estoque.remove(produto);
							break;
						} else {
							System.out.println("\nDigite um produto válido");
							break;
						}
				}
				case 3:{
					ler.nextLine();
					System.out.println("\nEntre com um produto para ser alterado/atualizado: ");
					produto = ler.nextLine();
						if (estoque.contains(produto)) {
								estoque.remove(produto);
								System.out.println("\nEntre com o novo produto");
								produto = ler.nextLine();
								estoque.add(produto);
								break;
						} else {
							System.out.println("Digite um produto válido");
							break;
						}
				}	
					case 4:{
						System.out.println("Estoque atual é: "+estoque);
						break;
						
					}	
					
						default:{
							System.out.println("Programa encerrado");
							op=0;
							break;
						}	
			}
		}while (op != 0);
		
	}
}


