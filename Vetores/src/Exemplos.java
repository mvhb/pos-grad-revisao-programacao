import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		int [] notas = new int [3];
		Scanner lerNota = new Scanner(System.in);
		
		for (int cont = 0; cont < 3; cont++) {
			notas[cont] = lerNota.nextInt();
		}
		for (int cont = 0; cont < 3; cont++) {
			System.out.println(notas[cont]);
		}
		
		
		// declaracao de vetor multidimensional
		int [][] matriz = new int [3][3];
		matriz[0][0] = 1;
		// or
		int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};
	}
}
