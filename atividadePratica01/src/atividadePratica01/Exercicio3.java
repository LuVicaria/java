package atividadePratica01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	// Instanciar um objeto da classe scanner
		Scanner leia = new Scanner(System.in);
	// Definir as variáveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
			
	// Entrada de dados
		System.out.println("*****************Calculadora de Salário Líquido*****************");
		System.out.println("Olá, colaborador! Esta calculadora é sua, use-a!");
		System.out.println("Digite o valor do salário bruto:");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o valor do adicional noturno:");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite o valor das horas extras - este valor será multiplicado por 5:");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o valor dos descontos:");
		descontos = leia.nextFloat();
	// Efetuar os cálculos
		System.out.printf("O seu salário Líquido é: %.2f%n", (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos);	
		System.out.println("****************************************************************");
		leia.close();
	}

}
