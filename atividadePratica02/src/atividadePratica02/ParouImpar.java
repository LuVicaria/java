package atividadePratica02;

import java.util.Scanner;

public class ParouImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nro;
		String parImpar, posNeg;
		
		System.out.println("*************************************************************");
		System.out.println("********************GURU DA MATEMÁTICA***********************");
		System.out.println("*Digite um numero:");
		nro = teclado.nextInt();
		
		  // Verifica se é par ou ímpar
        if (nro % 2 == 0) {
            parImpar = "par";
        } else {
            parImpar = "ímpar";
        }
        
        //Verifica se é Negativo ou positivo
        if (nro >= 0) {
        	posNeg = "positivo";
        } else {
        	posNeg = "negativo";
        }
        System.out.println("\nO número " + nro + " é " + parImpar + " e " + posNeg + "!");

		teclado.close();
	}

}
