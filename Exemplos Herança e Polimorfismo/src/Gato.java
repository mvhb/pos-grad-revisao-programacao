
public class Gato extends Animal{

	//atributos
		private String temperamento;
		private String corRabo;
		
	//construtor - sem parametro
		public Gato() {
			this.temperamento = "normal";
			this.corRabo = "cinza";	
		}
	
	//construtor com parametro
		public Gato(String cor, double peso, String raca, double altura, String temperamento, String corRabo) {
			this.temperamento = temperamento;
			this.corRabo = corRabo;
			setCor(cor);
			setPeso(peso);
			setRaca(raca);
			setAltura(altura);
		}
		
	//m?todos
		public String getTemperamento() {
			return temperamento;
		}
		public void setTemperamento(String temperamento) {
			this.temperamento = temperamento;
		}
		public String getCorRabo() {
			return corRabo;
		}
		public void setCorRabo(String corRabo) {
			this.corRabo = corRabo;
		}
		
		//polimorfismo 
		public void morder() {
			System.out.println("mordendo como um gato");
		};
		
		public void correr() {
			System.out.println("correndo com um gato");
		};
			
}
