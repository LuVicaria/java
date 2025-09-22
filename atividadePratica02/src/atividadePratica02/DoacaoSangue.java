package atividadePratica02;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idadeDoador;
		String nomeDoador, apto;
		boolean primeiraDoacao = false;
		
		System.out.println("*************************************************************");
		System.out.println("*********************DOAÇÃO DE SANGUE************************");
		System.out.println("*Digite o Nome do doador:");
		nomeDoador = teclado.next();
		System.out.println("*Digite a Idade do doador:");
		idadeDoador = teclado.nextInt();
		System.out.println("*Primeira doação de sangue?");
		primeiraDoacao = teclado.nextBoolean();
		
		// Verifica a idade do doador
		if(idadeDoador >= 18 && idadeDoador <= 69 ) {
			apto = "está apto";
			 if (idadeDoador >= 60 && idadeDoador <= 69 &&  primeiraDoacao == true){
				 apto = "não está apto";
			 }else{
					 apto = "está apto";
				 }
				 }else{apto = "não está apto";
		}
		//Retorno TELA
				System.out.println(nomeDoador + " " + apto + " para doar sangue!");

				teclado.close();
		}
	}