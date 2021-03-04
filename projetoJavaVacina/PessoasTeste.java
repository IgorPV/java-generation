package projetoJavaVacina;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoas teste[] = new Pessoas[1];
		
		
		for(int i=0; i<teste.length ;i++) {
			teste[i] = new Pessoas(null,null,null,null,null,null,0);
			teste[i].cadastrarPessoa();
			teste[i].verificaCad();
			teste[i].setStatusVacina();
		}
		
		
			
		
	}

}
