package ExercicioAula7;

public class Cachorro extends Animal {
	
	private boolean deveCorrer;
	
	public Cachorro(){
		super("Cachorro", 5, "Au Au");
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
			System.out.println("Ele corre");
		}else {
			System.out.println("Ele não corre");
		}
	}
}
