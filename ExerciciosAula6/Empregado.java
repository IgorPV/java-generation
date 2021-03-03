package ExerciciosAula6;

public class Empregado extends Pessoa {

		private int codigoSetor;
		private float salarioBase;
		private float imposto;
		
		public Empregado(String nome, int codigo, float salario) {
			
			super(nome);
			setCodigoSetor(codigo);
			setSalarioBase(salario);
									
		}

		public int getCodigoSetor() {
			return codigoSetor;
		}

		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public float getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(float salarioBase) {
			this.salarioBase = salarioBase;
		}

		public float getImposto() {
			return imposto;
		}

		public void setImposto(float imposto) {
			this.imposto = imposto;
		}
		
		public float calcularSalario(){
			float salario;
		    salario = getSalarioBase()*(1-(getImposto()/100));
			return salario;
        }
}
