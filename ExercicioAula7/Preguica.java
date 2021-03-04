package ExercicioAula7;

public class Preguica extends Animal{

	private boolean deveSubirArvore;
	
		public Preguica(){
			super("Preguica", 2, "Aaaaa");
		}
		@Override
		public void imprimeSom() {
			System.out.println(super.som);
		}
		public boolean isDeveSubirArvore() {
			return deveSubirArvore;
		}
		public void setDeveSubirArvore(boolean deveSubirArvore) {
			this.deveSubirArvore = deveSubirArvore;
		}
		
		public void imprimeSubir() {
			if (isDeveSubirArvore()==true) {
				System.out.println("Olha ela subindo!");
			} else {
				System.out.println("Não subiu");
			}
		}
}


