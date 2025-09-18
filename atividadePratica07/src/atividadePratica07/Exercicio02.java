package atividadePratica07;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numeroDigitado; 
		
		//instanciando o arrayList
		ArrayList <Integer> numerosInt = new ArrayList<Integer>();
		
		// inicializando Array com 10 números inteiros:
		numerosInt.add(5);
		numerosInt.add(10);
		numerosInt.add(6);
		numerosInt.add(12);
		numerosInt.add(7);
		numerosInt.add(14);
		numerosInt.add(8);
		numerosInt.add(16);
		numerosInt.add(9);
		numerosInt.add(18);
		
		//System.out.println(numerosInt);
		
		System.out.println("Digite um número inteiro:");
		numeroDigitado = teclado.nextInt();
		
		//Transformando em Wrapper
		Integer iNumeroDigitado = numeroDigitado;
		int seNulo = numerosInt.indexOf(iNumeroDigitado);
		
		//Imprime qual posição está o número digitado.
		if (seNulo == -1) {
			System.out.println("O número " + iNumeroDigitado + " não foi encontrado!");
		}else {
			System.out.println("O número " + iNumeroDigitado + " está localizado na posição: " + numerosInt.indexOf(iNumeroDigitado));
		}
		
	teclado.close();
	
	}
}
