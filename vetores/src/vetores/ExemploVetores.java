package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetores {

	public static void main(String[] args) {
		// criar objeto para a classe Scanner
		Scanner teclado = new Scanner(System.in);
		// criando vetor com dados
		String nomes[] = {"Cintia", "Stella", "Patricia", "Rafaela", "Leticia","Jamila"};
		
		// criando vetor sem dados
		int numeros[] = new int[5];
		
		System.out.println("Listagem vetor de nomes");
		
		//classe de arrays e sort o metodo para colocar em sequência
		//Arrays.sort(nomes);
		Arrays.sort(nomes, Collections.reverseOrder());
		//criando um indice para o vetor de nomes
		for (int indice = 0; indice < nomes.length; indice ++) {
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);// %d integer %s string
		}
		System.out.println("Listagem vetor de números");
		//criando um indice para o vetor
				for (int indice = 0; indice < numeros.length; indice ++) {
					System.out.printf("números[%d] = %s%n", indice, numeros[indice]);// %d integer %s string
				}
		
				System.out.println("Input de dados- vetor de números");
		//criando um indice para o vetor buscando dados do teclado
				for (int indice = 0; indice < numeros.length; indice ++) {
					System.out.println("Digite um valor:");	
					numeros[indice] = teclado.nextInt();
				}
		System.out.println("Listagem vetor de números com teclado");
		for (int indice = 0; indice < numeros.length; indice ++) {
			System.out.printf("numeros[%d] = %s%n", indice, numeros[indice]);// %d integer %s string %n pula linha
		}
						
		teclado.close();
	}

}
