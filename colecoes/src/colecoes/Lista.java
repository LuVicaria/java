package colecoes;
import java.util.ArrayList;


public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		// troca do indice
		numeros.set(numeros.indexOf(10), 4);
		System.out.println(numeros);
		System.out.println("Exibir o indice do elemento 10:" + numeros.indexOf(10)); // -1 significa que ele não achou
		
		// Excluir o valor - só exclui o primeiro numero que achar
		numeros.remove(numeros.indexOf(5));
		System.out.println(numeros);
		
		// FOR EACH - é um for mais limpo;
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
	}

}
