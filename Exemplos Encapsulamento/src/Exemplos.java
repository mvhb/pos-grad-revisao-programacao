import java.util.Scanner;

public class Exemplos {

	public static void main (String[] args) {
		
		//criando um objeto a partir da classe Cachorro
		
		Scanner valorLido = new Scanner(System.in);
		
		Cachorro luppy = new Cachorro();
		
		System.out.println("Informe a cor do dog: ");
		luppy.setCor(valorLido.nextLine());
		System.out.println(luppy.getCor());
		
		
		// chamando os metodos
		luppy.correr();
		luppy.escrever();
		luppy.latir();
		luppy.morder();
	}
}
