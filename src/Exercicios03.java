import java.util.Scanner;

public class Exercicios03 {
	// exercicio 1
	public static void getDataDeAniversario() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a data de nascimento: ");
		String dataDeNascimento = input.nextLine();
		
		
		DataDeNascimento dataDoUsuario = new DataDeNascimento();
		dataDoUsuario.setDia(String.valueOf(dataDeNascimento.charAt(0)) + String.valueOf(dataDeNascimento.charAt(1)));
		dataDoUsuario.setMes(String.valueOf(dataDeNascimento.charAt(3)) + String.valueOf(dataDeNascimento.charAt(4)));
		dataDoUsuario.setAno(String.valueOf(dataDeNascimento.charAt(6)) + String.valueOf(dataDeNascimento.charAt(7)) + String.valueOf(dataDeNascimento.charAt(8)) + String.valueOf(dataDeNascimento.charAt(9)));
		
		System.out.println("Você nasceu em " + dataDoUsuario.getDia() + " de " + dataDoUsuario.getMes() + " de " + dataDoUsuario.getAno());
	}
	
	public static void main (String[] args) {
		Exercicios03.getDataDeAniversario();
	}
}
