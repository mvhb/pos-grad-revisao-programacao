import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[] args) {
		List<String> listaStrings = new ArrayList<String>();
		List<Integer> listaInteiros = new ArrayList<Integer>();
		
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o conjunto de dados: ");
		
		String conjuntoDeDados;
		conjuntoDeDados = read.nextLine();
		
		String [] caracteres = conjuntoDeDados.split(" ");
		for (String string : caracteres) {
			if (string.matches("-?(0|[1-9]\\d*)")) {
				listaInteiros.add(Integer.parseInt(string));
			}
			else {
				listaStrings.add(string);
			}
		}
		
		System.out.println("Lista de inteiros: " + listaInteiros);
		System.out.println("Lista de strings: " + listaStrings);
	}

}
