package atividadePratica03;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int idade, identidadeGen, pessoaDesenv, nroPessoaDesenvB = 0, mulheresCisTransFront= 0, homensCisTransMobM40 = 0, nbinarioFullm30 = 0;
		double media = 0, totalRespostas = 0, somaIdades = 0;
		String continua = "S"; // variável para while
		
		//laço condicional While
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("=======================Pesquisa Conhecer===========================");
			System.out.println("Digite a sua idade: ");
			idade = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.

			System.out.println("Identidade de Gênero: ");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem  Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			identidadeGen = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.

			System.out.println("Pessoa Desenvolvedora: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			pessoaDesenv = teclado.nextInt(); // nextint é para ler valores do tipo inteiro.
			
			
				//O número de pessoas desenvolvedoras Backend
				if (pessoaDesenv == 1){
					nroPessoaDesenvB ++; 
				}
				//	O número de Mulheres Cis e Trans desenvolvedoras Frontend
				if ((identidadeGen == 1 || identidadeGen == 4) && pessoaDesenv == 2){
					mulheresCisTransFront ++; 
				}
								
				//	O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
				if ((identidadeGen == 2 || identidadeGen == 5) && pessoaDesenv == 3 && idade >= 40 ){
					homensCisTransMobM40 ++; 
				}
				//	O número de Não Binários desenvolvedores FullStack menores de 30 anos
				if (identidadeGen == 3 && pessoaDesenv == 4 && idade <= 30 ){
					nbinarioFullm30 ++; 
				}
				//	O número total de pessoas que responderam à pesquisa
				totalRespostas ++;
				
				//	A média de idade das pessoas que responderam à pesquisa
				somaIdades += idade;// já soma a idade com o valor de soma idades
				media = somaIdades/totalRespostas;
							
			//continuação do while?
			System.out.println("Deseja continuar? (S)");
			teclado.skip("\\R"); // Para ler a string inteira e não dar erro, pois ele entende que o enter é um valor string.
			continua = teclado.nextLine().toUpperCase();
		}
		System.out.println("=======================Resultado da pesquisa=======================");
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + nroPessoaDesenvB); 

		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisTransFront); 

		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisTransMobM40); 
		
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbinarioFullm30); 

		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalRespostas); 
		 
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n",media); 
		
		teclado.close();
	}

}
