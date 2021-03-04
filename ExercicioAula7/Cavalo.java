package ExercicioAula7;

public class Cavalo extends Animal{

	private boolean deveCorrer;
	
		public Cavalo(String nome, int idade,String som){
			super(nome, idade, som);
		}
		@Override
		public void imprimeSom() {
			System.out.println(super.som);
		}
		public boolean isDeveCorrer() {
			return deveCorrer;
		}
		public void setDeveCorrer(boolean deveCorrer) {
			this.deveCorrer = deveCorrer;
		}
		
		public void escreverCorrer() {
			if (isDeveCorrer() == true) {
				System.out.println(getNome()+" está com pressa");
			}else {
				System.out.println(getNome()+" não está interessada");
			}
		}
}
