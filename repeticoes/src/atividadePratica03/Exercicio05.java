package atividadePratica03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero, numerosPositivos = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			
			if (numero >= 0) {
				numerosPositivos += numero;	
			}
			
		}while(numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d%n", numerosPositivos);

		
		teclado.close();
	}

}
