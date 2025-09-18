package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//Instanciando a fila
		Queue<String>  fila = new LinkedList<String> ();
		
		//Criando a fila
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");
		
		System.out.println(fila);
		
		//Retirar um elemento da fila - sempre o primeiro que entrou FI FO.
		fila.remove();
		
		System.out.println(fila);
		
		//adicionar nova pessoas na fila
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);

		//Tamanho da fila
		
		System.out.println("Tamanho da fila é: " + fila.size());
		
		//percorrer a fila
		// criar uma variavel pessoa que é da classe String
		// se utilizar uma variavel usando o var sabe qual é o tipo que deve criar 
		for (var pessoa : fila) {
		
			System.out.println(pessoa);
			
		}
		
		System.out.println("A primeira pessoa da fila é: " + fila.peek());


	}

}
