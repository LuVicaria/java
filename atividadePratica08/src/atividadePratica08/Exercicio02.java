package atividadePratica08;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);

	//instancia o metodo Deque - Pilha
	Deque<String> pilha = new ArrayDeque<String>();
	
	String nome, chamar;
	boolean vazia;
	int opcao;
	

	
	do {
			
	System.out.println("*******************************************************");		
	System.out.println("1 - Adicionar um novo livro na pilha");		
	System.out.println("2 - Listar todos os livros da Pilha");
	System.out.println("3 - Retirar um livro da pilha");
	System.out.println("0 - Sair");
	System.out.println("*******************************************************");		
	System.out.println("Entre com a opção desejada:");
	opcao = teclado.nextInt();
	
	
	switch(opcao) {
	case 1:
		
		System.out.println("Digite o nome do livro:");
		teclado.skip("\\R");
		nome = teclado.nextLine();
		pilha.push(nome);
	
		System.out.println(pilha);
		System.out.println("Livro adicionado!");
		
		for (String livro : pilha) {
            System.out.println( livro);
        }

		break;
	case 2:
		
		// caso a PILHA esteja vazia 
		vazia = pilha.isEmpty();
		
		if  (vazia == false) {
			System.out.println("Lista de livros na pilha: ");
			//Detalha os livros da pilha
			for (String livro : pilha) {
	            System.out.println( livro);
	        }
			
		}else {
			System.out.println("A pilha está vazia!");			
		}

		break;
	case 3:
		// caso a Pilha esteja vazia 
		vazia = pilha.isEmpty();
		
		if  (vazia == false) {
			chamar = pilha.peek();
			System.out.printf("O livro %s, foi retirado da pilha!%n", chamar);
			pilha.pop();
		}else {
			System.out.println("A Pilha está vazia!");
		}
		
		break;
	}
	} while (opcao != 0);
	
	teclado.close();

	}
}