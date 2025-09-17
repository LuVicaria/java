package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// VARIÁVEIS
		int idade, esporte, futebol = 0, voleiM18 = 0,basquetem18 = 0, totalRespostas = 0;
		String continua = "S";
		long somaIdades = 0;
		double mediaIdades = 0;
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Pesquisa - Esporte Favorito");
			System.out.println("Digite a sua idade: ");
			idade = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.
			//menu de esportes
			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");
			System.out.println("Digite o seu esporte favorito: ");
			esporte = teclado.nextInt();
			
			//Total de pessoas que gostam de futebol
			
			if (esporte == 1) {
				futebol ++;
			}

			// total de pessoas que gostam de volei e são maiores de 18 anos
			if (esporte == 2 && idade >= 18) {
				voleiM18 ++;
			}
			
			//total de pessoas que gostam de basquetebol e são menores de 18 anos.
			if (esporte == 3 && idade <= 18) {
				basquetem18 ++;
			}
			
			//Cálculos
			
			somaIdades += idade;// já soma a idade com o valor de somaidades
			totalRespostas ++;
			
			
			System.out.println("Deseja continuar? (S)");
			teclado.skip("\\R"); // Para ler a string inteira e não dar erro, pois ele entende que o enter é um valor string.
			continua = teclado.nextLine().toUpperCase();	
		}
		
		mediaIdades = Math.round(somaIdades / totalRespostas);
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);// %d - é para inteiros %n - para pular linha
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);// %d - é para inteiros %n - para pular linha
		System.out.printf("Total de pessoas que gostam de basquetebol e são menores de 18: %d%n", basquetem18);// %d - é para inteiros %n - para pular linha
		System.out.printf("Media das idades: %.2f%n", mediaIdades);// %.2f - é para double %n - para pular linha

		teclado.close();
	}

}
