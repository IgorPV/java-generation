package ExerciciosAula6;

public class Fornecedor extends Pessoa {
	
	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor(String nome, String telefone,String endereco, float valorCredito, float valorDivida) {
		
		super(nome,telefone,endereco);
		setValorCredito(valorCredito);
		setValorDivida(valorDivida);
		
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public float valorSaldo() {
		
		return this.valorCredito - this.valorDivida;
		
	}
	
	
}
