
public class Animal {
	
	//atributos
	private String cor;
	private double peso;
	private String raca;
	private double altura;
	
	//construtor -- sem passar parametro
	public Animal() {
		this.cor = "rosa chiclete";
		//or setCor("");
		this.peso = 0;
		this.altura = 0.0;
		this.raca = "n?o definida";
	}
	
	//construtor -- passando parametro
	public Animal(String cor, double peso, String raca, double altura) {
		this.cor = cor;
		//or setCor(cor);
		this.peso = peso;
		this.altura = altura;
		this.raca = raca;
	}
	
	//metodos
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCor(String cor){
		
		if(cor.equals("")) {
			System.out.println("me ajude a te ajudar");
		}
		else {
			this.cor = cor;	
		}
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void morder(){
		System.out.println("vacilou, levou");
	}
	
	public void correr(){
		System.out.println("run run run");
	}
}

