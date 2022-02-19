import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exemplos {

	public static void main(String[] args) {
		// Exemplo de lista
		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("rodrigo");
		listaNomes.add("indy");
		listaNomes.add("thiago");
		
		System.out.println(listaNomes);
		
		for(int count = 0; count < listaNomes.size(); count++) {
			System.out.println(listaNomes.get(count));
		}
		
		// Exemplo de fila
		Queue<Integer> filaNumeros = new LinkedList<Integer>();
		
		filaNumeros.add(50);
		filaNumeros.add(20);
		filaNumeros.add(10);
		filaNumeros.add(45);
		filaNumeros.add(5);
		
		System.out.println(filaNumeros);
		
		//primeiro da fila
		System.out.println(filaNumeros.peek());
		
		filaNumeros.remove();
		System.out.println(filaNumeros);
		
		System.out.println(filaNumeros.isEmpty());
		
		// outra forma de percorrer a fila
		for (Integer valor : filaNumeros) {
			System.out.println(valor);
		}
		
		// Exemplo de pilha
		//Deque<String> pilhaNomes = new LinkedList<String>();
		Deque<String> pilhaNomes = new ArrayDeque<String>();
		
		pilhaNomes.push("marilia");
		pilhaNomes.push("yago");
		pilhaNomes.push("emanuel");
		pilhaNomes.push("oscar");
		pilhaNomes.push("talita");
		
		System.out.println(pilhaNomes);
		
		//ultimo: primeiro a sair
		System.out.println(pilhaNomes.peek());
	}

}
