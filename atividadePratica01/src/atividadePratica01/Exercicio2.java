package atividadePratica01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Instanciar um objeto da classe scanner
		Scanner leia = new Scanner(System.in);
		// Definir as variáveis
		float nota1, nota2, nota3, nota4;
			
		// Entrada de dados
		System.out.println("***********************MEDIA FINAL***********************");
		System.out.println("*Exemplo formatação dos dados: 10,0 ou 10*");
		System.out.println("Digite o valor da 1° nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite o valor da 2° nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite o valor da 3° nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite o valor da 4° nota: ");
		nota4 = leia.nextFloat();
		
	// Efetuar os cálculos
		System.out.printf("Sua média final é: %.1f%n", (nota1 + nota2 + nota3 + nota4) / 4);	
		System.out.println("**********************************************************");
		leia.close();
	}

}
