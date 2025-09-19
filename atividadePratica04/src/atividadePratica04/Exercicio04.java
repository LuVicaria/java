package atividadePratica04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Declaração da matrizes
		float matriz[][] = new float [10][4];
		
		// declaração do vetor
		float media[] = new float[10];
		
		float soma = 0.0f;
		
		// criação da matriz com entrada de dados
		for (int linha = 0; linha < matriz.length; linha ++) {
			System.out.println("Digite as notas do " + (linha+1) + "º aluno:");

			for (int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				
				//System.out.printf("Aluno [%d]  Nota [%d] ", linha, coluna); 
				//System.out.printf("matriz[%d][%d] [%.2f]%n ", linha, coluna, matriz[linha][coluna]);
				System.out.println((coluna + 1)+"º nota: " );
				matriz[linha][coluna] = teclado.nextFloat();
				soma += matriz[linha][coluna];
				 //System.out.println("matriz[linha][coluna] " +matriz[linha][coluna]); 
				 //System.out.println("Soma" + soma); 
				 
			}
			
			 media[linha] = soma / matriz[linha].length;
			// System.out.printf("Media %.1f", media[linha]); 
			 soma = 0.0f;
		}
		
		
	for (int indice = 0; indice < media.length; indice++) {
			System.out.printf("Media do Bimestre do %dº aluno = %.1f%n", indice + 1, media[indice]);
	}
	teclado.close();

}

}
