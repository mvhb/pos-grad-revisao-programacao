
public class Exemplos {

	public static void main (String[] args) {
		
		//criando um objeto a partir da classe Cachorro
		
		Cachorro luppy = new Cachorro();
		
		luppy.acessorios = "pulseira, relogio";
		luppy.altura = 1.24;
		luppy.cor = "black and white";
		luppy.peso = 12;
		luppy.raca = "shitzu";
		
		//mostrar os dados
		System.out.println(luppy.acessorios);
		System.out.println(luppy.altura);
		System.out.println(luppy.cor);
		System.out.println(luppy.peso);
		System.out.println(luppy.raca);
		
		// chamando os metodos
		luppy.correr();
		luppy.escrever();
		luppy.latir();
		luppy.morder();
	}
}
