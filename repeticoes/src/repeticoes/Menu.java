// aula sobre laços de repetição.

package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao = 1;
		// do while
		do {
			System.out.println("Digite a opção desejada:");
			opcao = teclado.nextInt();
			
		}while(opcao==0);
		
		// WHILE
		/*while(opcao==0) {
			System.out.println("Digite a opção desejada:");
			opcao = teclado.nextInt();
		}*/
		
		teclado.close();

	}

}
