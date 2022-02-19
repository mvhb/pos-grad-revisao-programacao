import java.util.Scanner;

public class Exemplos {

	public static void main (String[] args) {
		
		//criando um objeto a partir da classe Cachorro
		
		//Cachorro luppy = new Cachorro();
		Cachorro luppy = new Cachorro("b and w", 10, "shitzzzu", 1.2, "bola");
		
		// chamando os metodos com polimorfismo
		luppy.correr();
		luppy.morder();
		
		// criando objeto Gato sem passar parametro
		Gato tom = new Gato();
		System.out.println(tom.getAltura());
		System.out.println(tom.getCor());
		System.out.println(tom.getCorRabo());
		System.out.println(tom.getPeso());
		System.out.println(tom.getRaca());
		System.out.println(tom.getTemperamento());
		
		// criando objeto Gato passando parametro
		Gato jack = new Gato("branco", 5, "nao tem", 1.2, "calmo", "nao identificado");
		System.out.println(jack.getCor());
		System.out.println(jack.getPeso());
		System.out.println(jack.getRaca());
		System.out.println(jack.getAltura());
		System.out.println(jack.getTemperamento());
		System.out.println(jack.getCorRabo());
		
		// chamando os metodos com polimorfismo
		jack.morder();
		jack.correr();
	}
}
