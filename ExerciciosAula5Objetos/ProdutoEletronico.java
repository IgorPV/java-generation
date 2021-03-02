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
	//método para info de produto
	public void infoProduto() {
		System.out.println("\nProduto: "+this.modelo+"\nMarca: "+this.marca+"\nPreço do produto: R$"+this.valor+"\nCadastrado com sucesso");
	}

	//método para comparar preço com outra loja	
	public void comparaPreco(float preco) {
		if(this.valor<preco) {
			System.out.println("O item em estoque é mais barato!");
		}else if(this.valor == preco){
			System.out.println("Os itens tem mesmo valor");
		}else {
			System.out.println("O nosso item é mais caro, ofereça desconto!");
		}
	}

}
