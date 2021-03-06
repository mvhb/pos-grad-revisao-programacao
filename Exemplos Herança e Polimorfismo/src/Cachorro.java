
public class Cachorro extends Animal{

	//atributos
	private String acessorios;
	
	//construtor -- sem parametro
	public Cachorro() {
		//op??o 1
		//super();
		
		//op??o 2
		this.acessorios = "";
		//or setAcessorios("");
		setCor("azul");
		setPeso(1.1);
		setRaca("aa");
		setAltura(1.3);
	}
	
	//construtor recebendo parametro
	public Cachorro(String cor, double peso, String raca, double altura, String acessorios) {
		this.acessorios = acessorios;
		setCor(cor);
		setPeso(peso);
		setRaca(raca);
		setAltura(altura);
	}
	
	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	
	//metodos
	public void latir() {
		System.out.println("au au");
	};

	public void escrever() {
		System.out.println("turma johnson baby");
	};
	
	//polimorfismo 
	public void morder() {
		System.out.println("mordendo como um cachorro");
	};
	
	public void correr() {
		System.out.println("correndo com um cachorro");
	};
}
