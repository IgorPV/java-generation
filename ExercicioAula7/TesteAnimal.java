package ExercicioAula7;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro();
		Cavalo epona = new Cavalo("Epona", 10, "Irraaa");
		Preguica preg = new Preguica();
		boolean correr1 = true;
		boolean correr2 = false;
		boolean subir = false;
		
		
		dog.imprimeSom();
		epona.imprimeSom();
		preg.imprimeSom();
		
		dog.setDeveCorrer(correr1);
		epona.setDeveCorrer(correr2);
		preg.setDeveSubirArvore(subir);
		
		dog.escreverCorrer();
		epona.escreverCorrer();
		preg.imprimeSubir();
		
		
		
	}

}
