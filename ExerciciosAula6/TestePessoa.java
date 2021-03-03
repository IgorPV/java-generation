package ExerciciosAula6;

public class TestePessoa {

	public static void main(String[] args) {
		System.out.println("--------------------teste para subclasse Fornecedor-------------------------------");
		Fornecedor p1 = new Fornecedor("Jos�","Rua Brasil 190","1133334444", 5000,7500);
		
		System.out.println("O endere�o de "+p1.getNome()+" �:"+p1.getEndereco());
		
		float saldo = p1.valorSaldo();
		
		System.out.println("O valor do saldo de "+p1.getNome()+" � :"+saldo);
		
		System.out.println("--------------------teste para subclasse Empregado-------------------------------");
		
		Empregado e1 = new Empregado(null,0,0);
		
		e1.setNome("Carlos");
		e1.setSalarioBase(3500);
		e1.setImposto(15);
		float salario = e1.calcularSalario();
		
		System.out.println("O sal�rio l�quido de "+e1.getNome()+" �: R$"+salario);
		
		System.out.println("--------------------teste para subclasse Administrador-------------------------------");
		
		Administrador a1 = new Administrador(p1.getNome(),p1.getTelefone());
		a1.setAjudaDeCusto();
		System.out.println("O administrador � "+a1.getNome());
		System.out.println("A ajuda de custo em reais � de: "+a1.getAjudaDeCusto());
	}

}
