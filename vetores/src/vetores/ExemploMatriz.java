package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		// criar objeto para a classe Scanner
				Scanner teclado = new Scanner(System.in);
		// Criando a matriz
				int  numeros [][] = { 
						{1,2,3},	
						{4,5,6},		
						{7,8,9}
				};
	
				System.out.println("Listar os dados - Matriz fixa");

				// Percorrer as linhas da matriz
				for (int linha = 0; linha < numeros.length; linha ++) {
					// Percorrer as colunas da matriz
					for (int coluna = 0; coluna < numeros.length; coluna ++) {
						System.out.printf("numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
					}
				}
				//	Matriz do tipo float		Linha e coluna
				float numerosReais[][] = new float[3][2];
				System.out.println("Listar os dados - Matriz numeros");
				System.out.println("tamanho da matriz Numeros Reais: " + numerosReais.length);
				System.out.println("tamanho da matriz Numeros Reais: " + numerosReais[0].length);

				// Percorrer as linhas da matriz
				for (int linha = 0; linha < numerosReais.length; linha ++) {
					// Percorrer as colunas da matriz
					for (int coluna = 0; coluna < numerosReais[linha].length; coluna ++) {
						System.out.printf("Digite o numero [%d][%d]%n",linha, coluna);
						numerosReais[linha][coluna] = teclado.nextFloat();
					}
				}				
				for (int linha = 0; linha < numerosReais.length; linha ++) {
					// Percorrer as colunas da matriz
					for (int coluna = 0; coluna < numerosReais[linha].length; coluna ++) {
						System.out.printf("numeros[%d][%d] = %2.f%n", linha, coluna, numerosReais[linha][coluna]);
					}
						
				}
				teclado.close();
	}

}
