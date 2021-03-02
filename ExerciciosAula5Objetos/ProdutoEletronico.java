package ExerciciosAula5Objetos;

public class ProdutoEletronico {

	private String marca;
	private String modelo;
	private float valor;
//construtor
	public ProdutoEletronico(String marca, String modelo, float valor) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;

	}
	//m�todo para info de produto
	public void infoProduto() {
		System.out.println("\nProduto: "+this.modelo+"\nMarca: "+this.marca+"\nPre�o do produto: R$"+this.valor+"\nCadastrado com sucesso");
	}

	//m�todo para comparar pre�o com outra loja	
	public void comparaPreco(float preco) {
		if(this.valor<preco) {
			System.out.println("O item em estoque � mais barato!");
		}else if(this.valor == preco){
			System.out.println("Os itens tem mesmo valor");
		}else {
			System.out.println("O nosso item � mais caro, ofere�a desconto!");
		}
	}

}
