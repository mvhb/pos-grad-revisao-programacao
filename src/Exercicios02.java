import java.util.Scanner;

public class Exercicios02 {
	
	// exercicio 1 - dia 2
	public static void MediaAritmetica() {
		Scanner input = new Scanner(System.in);
		int [] notas = new int[4];
		int somaNotas = 0;
		for (int count = 0; count < 4; count++) {
			System.out.println("Digite a nota: ");
			notas[count] = input.nextInt();
		}
		for (int index = 0; index < 4; index++) {
			somaNotas = somaNotas + notas[index];
		}
		int media = somaNotas / notas.length;
		System.out.println("A m?dia ?: " + media);
	}
	
	// exercicio 2 - dia 2
	public static void NumeroSucessor() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero entre 0 e 60: ");
		int numero = input.nextInt();
		if(numero < 0 || numero > 60) {
			System.out.println("Voce deve informar um n?mero entre 0 e 60");
		}
		else {
			if(numero == 60) {
				System.out.println("O sucessor ? 0");
			}
			else {
				System.out.println("O sucessor ?: " + (numero + 1));
			}
		}
	}
	
	// exercicio 3 - dia 2
	public static void FromFahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit: ");
		int temperatura = input.nextInt();
		
		double temperaturaEmCelsius = ((temperatura - 32) * 5)/9;
		System.out.println("A temperatura em Celsius ?: " + temperaturaEmCelsius);
	}

	// exercicio 4 - dia 2
	public static void GanhadoresDoConcurso() {
		double valorTotal = 780.000;
		double primeiroGanhador = valorTotal * (0.46);
		double segundoGanhador = valorTotal * (0.32);
		double terceiroGanhador = valorTotal - primeiroGanhador - segundoGanhador;
		
		System.out.println("O valor do primeiro ganhador foi: " + primeiroGanhador);
		System.out.println("O valor do segundo ganhador foi: " + segundoGanhador);
		System.out.println("O valor do terceiro ganhador foi: " + terceiroGanhador);
	}
	
	// exercicio 5 - dia 2
	public static void ChecadorDePalindromo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Informe a palavra para checar se ? palindromo: ");
		String palavra = input.nextLine();
		int quantidadeDeCaracteres = palavra.length();
		int checarAte = quantidadeDeCaracteres / 2;
		boolean ehPalindromo = true;
		
		for(int index = 0; index < checarAte; index++) {
			if(palavra.charAt(index) != palavra.charAt(palavra.length() - index - 1)) {
				ehPalindromo = false;
			}
		}
		
		System.out.println("A palavra ? palindromo? " + ehPalindromo);
		
	}
	
	// exercicio 6 - dia 2
	public static void SaltoEmDistancia() {
		
		Scanner inputString = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.println("Informe o nome do atleta: ");
		String nomeDoAtleta = inputString.nextLine();
		
		while (!nomeDoAtleta.equals("")) {
			System.out.println("Informe o primeiro salto do atleta: ");
			double primeiroSalto = inputInt.nextDouble();

			System.out.println("Informe o segundo salto do atleta: ");
			double segundoSalto = inputInt.nextDouble();
			
			System.out.println("Informe o terceiro salto do atleta: ");
			double terceiroSalto = inputInt.nextDouble();
			
			System.out.println("Informe o quarto salto do atleta: ");
			double quartoSalto = inputInt.nextDouble();
			
			System.out.println("Informe o quinto salto do atleta: ");
			double quintoSalto = inputInt.nextDouble();
			
			double media = (primeiroSalto + segundoSalto + terceiroSalto + quartoSalto + quintoSalto) / 5;
			
			System.out.println("Resultado:");
			System.out.println("Atleta: " + nomeDoAtleta);
			System.out.println("Saltos: " + primeiroSalto + " - " + segundoSalto + " - " + terceiroSalto + " - " + quartoSalto + " - " + quintoSalto);
			System.out.println("M?dia dos saltos: " + media + "m");
			
			System.out.println("Informe o nome do atleta: ");
			nomeDoAtleta = inputString.nextLine();
	}
}
	
	public static void main(String[] args) {
		new Exercicios02().MediaAritmetica();
		new Exercicios02().NumeroSucessor();
		new Exercicios02().FromFahrenheitToCelsius();
		new Exercicios02().GanhadoresDoConcurso();
		new Exercicios02().ChecadorDePalindromo();
		new Exercicios02().SaltoEmDistancia();
	}

}
