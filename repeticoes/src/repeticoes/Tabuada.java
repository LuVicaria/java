// aula sobre laços de repetição.
package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int contador = 1; 
		
		System.out.println("Digite um número inteiro: ");
		numero = teclado.nextInt();
		
		//sintaxe do FOR
	/*	for(int contador = 1; contador <= 10; contador ++) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		}*/
		
		//sintaxe do WHILE
		
		while (contador <= 10) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
			contador ++;
		}
		teclado.close();
	}
}
