package metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		// Instanciar um objeto da classe scanner
		Scanner leia = new Scanner(System.in);
				
		// Definir as variáveis
		double numero1, numero2, resultadoDivisao;
				
		// Entrada de dados
		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextDouble();
				
		System.out.println("Digite o segundo número:");
		numero2 = leia.nextDouble();
				
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, multiplicar(numero1, numero2));
		resultadoDivisao = dividir(numero1, numero2);
		
		if (resultadoDivisao == -1) {
			System.out.println("não existe divisão por zero!");
		}else {
			System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, resultadoDivisao);

		}
		
		/*
		// Operações matemáticas com a classe math
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f%n", numero1, Math.sqrt(numero1));
		*/
		leia.close();
		sobre();
	}
		// variáveis distintas, estas são utilizadas pelo metodo
		public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
		}
		// variáveis distintas, estas são utilizadas pelo metodo
		public static double subtrair(double numero1, double numero2) {
			return numero1 - numero2;
		}
		// variáveis distintas, estas são utilizadas pelo metodo
		public static double multiplicar(double numero1, double numero2) {
			return numero1 * numero2;
		}
		// variáveis distintas, estas são utilizadas pelo metodo
		public static double dividir(double numero1, double numero2) {
			if (numero2 == 0) {
				return -1;
			}
			return numero1 / numero2;
		}
		public static void sobre() {
			System.out.println("\n******************************************");
			System.out.println("\nCalculadora desenvolvida por Luana Vicaria");
			System.out.println("\n******************************************");
		}
}
