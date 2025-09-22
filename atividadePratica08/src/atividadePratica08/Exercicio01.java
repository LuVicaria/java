package atividadePratica08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//Instanciando a fila
		Queue<String>  fila = new LinkedList<String> ();
		
		int opcao = 0, i;
		String nome, chamar;
		boolean vazia;
		
		do {
				
		System.out.println("*******************************************************");		
		System.out.println("1 - Adicionar Cliente na Fila");		
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("*******************************************************");		
		System.out.println("Entre com a opção desejada:");
		opcao = teclado.nextInt();
		//Iniciando o contador para descrição em tela
		i = 1;
		switch(opcao) {
		
		case 1:
			
			System.out.println("Digite o nome do cliente:");
			nome = teclado.next();
			fila.add(nome);
			
			//Detalha os clientes da fila por ordem de chegada
			for (var pessoa : fila) {
				
				System.out.println(i + " - " + pessoa);
				i ++;
				
			}

			System.out.println("Cliente Adicionado!");

			break;
		case 2:
			
			// caso a fila esteja vazia 
			vazia = fila.isEmpty();
			
			if  (vazia == false) {
				System.out.println("Lista de clientes na fila: ");
				for (var pessoa : fila) {
					
					System.out.println(i + " - " + pessoa);
					i ++;	
				}
				
			}else {
				System.out.println("A Fila está vazia!");			
			}

			break;
		case 3:
			// caso a fila esteja vazia 
			vazia = fila.isEmpty();
			
			//System.out.println(vazia);
			if  (vazia == false) {
				chamar = fila.peek();
				System.out.printf("Cliente %s, favor dirija-se ao caixa!%n", chamar);
				fila.remove();
			}else {
				System.out.println("A Fila está vazia!");

			}
			
			break;
		}
		} while (opcao != 0);
		
		teclado.close();
	}

}