package atividadePratica01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Instanciar um objeto da classe scanner
			Scanner leia = new Scanner(System.in);
		// Definir as variáveis
			float salario, abono;
				
		// Entrada de dados
			System.out.println("*****************Calculadora de Salário e Abono*****************");
			System.out.println("Digite o valor do salário:");
			salario = leia.nextFloat();
			System.out.println("Digite o valor do abono:");
			abono = leia.nextFloat();
		// Efetuar os cálculos
			System.out.printf("Parabéns O seu novo salário é: %.2f%n", salario + abono);	
			System.out.println("****************************************************************");
			leia.close();
	}

}
