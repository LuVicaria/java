package atividadePratica03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variaveis e matrizes
		float matriz[][] = new float [2][4];
		
		float media[] = new float[2];
		
		float soma = 0.0f;
		int qtd = 0;
		
		for (int linha = 0; linha < matriz.length; linha ++) {
			System.out.println("Digite a nota do aluno " + linha);
			for (int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.printf("Aluno [%d]  Nota [%d] ", linha, coluna); 
				matriz[linha][coluna] = teclado.nextFloat();
				
				System.out.printf("matriz[%d][%d] [%.2f]%n ", linha, coluna, matriz[linha][coluna]);
				 soma += matriz[linha].length;
				 System.out.println("Soma" + soma); 
			}
			media[linha] = soma /qtd;
			 System.out.println("qtd matriz" + matriz[linha].length);
				
		}
		
		
		/// TEM ERRO AQUI
		/*for (int indice = 0; indice < media.length; indice ++) {
			soma += matriz[linha][coluna];
		}
		
		for (int indice = 0; indice < media.length; indice++) {
			System.out.printf("media do %dº aluno = %.2f%n", indice + 1, media[indice]);
		}*/
teclado.close();


	}

}
