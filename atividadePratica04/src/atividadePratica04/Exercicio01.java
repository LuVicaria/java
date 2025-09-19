package atividadePratica04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int pares[] = { 2, 4, 6, 8, 12, 14, 16, 18, 20, 22};
		int numero;

		System.out.println("Digite o número: ");
		numero = teclado.nextInt();

		for (int i = 0; i < pares.length; i ++) {
			if (numero == pares[i]) {
				System.out.printf("O número %d está localizado na posição: %d", numero, i);
				return;
			}
		}

		System.out.println("O número " + numero + " não foi encontrado!");

	}

}
