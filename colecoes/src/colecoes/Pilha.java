package colecoes;
import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {

	public static void main(String[] args) {
		//instancia o metodo Deque
		Deque<String> pilha = new ArrayDeque<String>();
			
		// adiciona fila
			pilha.push("Duna");
			pilha.push("Pai Rico Pai Pobre");
			pilha.push("Maus");
			pilha.push("Crime e castigo");
			pilha.push("Quarto de despejo");

			System.out.println(pilha);
			
			//retira da fila
			pilha.pop();
			System.out.println(pilha);
			
			//procurar dentro da pilha
			System.out.println("O livro Guia do Mochileiro da galáxia está na pilha? " + pilha.contains("Guia do Mochileiro da galáxia"));

	}

}
