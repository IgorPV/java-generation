package projetoJavaVacina;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoas teste = new Pessoas("Igor","pereira","vieira","ZS","23/10/1993","1993",27);
		Pessoas teste2 = new Pessoas(null, null, null, null, null, null, 0);
		
		
		teste.setSenha();
		
		teste.verificaCad();
		teste2.verificaCad();
		
		
		
		
	}

}
