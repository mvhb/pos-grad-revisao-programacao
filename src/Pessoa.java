
public class Pessoa {
	
	// atributos
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// metodos
	public void Envelhecer(int anos) {
		this.idade = this.idade + anos;
	}

	public void Engordar(double peso) {
		this.peso = this.peso + peso;
	}
	
	public void Emagrecer(double peso) {
		this.peso = this.peso - peso;
	}
	
	public void Crescer(double altura) {
		this.altura = this.altura + altura;
	}
}
