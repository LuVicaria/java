package atividadePratica01;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Instanciar um objeto da classe scanner
				Scanner leia = new Scanner(System.in);
			// Definir as variáveis
				float n1, n2, n3, n4;
					
			// Entrada de dados
				System.out.println("*****************PRODUTOS*****************");
				System.out.println("Digite o valor do Produto 1:");
				n1 = leia.nextFloat();
				System.out.println("Digite o valor do Produto 2:");
				n2 = leia.nextFloat();
				System.out.println("Digite o valor do Produto 3:");
				n3 = leia.nextFloat();
				System.out.println("Digite o valor do Produto 4:");
				n4 = leia.nextFloat();
			// Efetuar os cálculos
				System.out.printf("Diferença: %.2f%n", (n1 * n2) - (n3 * n4));	
				System.out.println("******************************************");
	}

}
