package atividadePratica03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int primeiroNro, segundoNro;
		
		
		System.out.println("=======================Multiplos de 3 e 5======================= ");
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNro = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.
		System.out.println("Digite o segundo número do intervalo: ");
		segundoNro = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.

		if (segundoNro < primeiroNro) {
			System.out.println("Intervalo inválido!");
			System.exit(0); // Encerra o programa com sucesso
		}else {
				System.out.printf("No Intervalo entre %d e %d:%n", primeiroNro, segundoNro);

				for (int i = primeiroNro; i <= segundoNro; i++) {
		            if (i % 3 == 0 && i % 5 == 0) { // Verifica se é múltiplo de 3 e 5
		                System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		teclado.close();
	}
}