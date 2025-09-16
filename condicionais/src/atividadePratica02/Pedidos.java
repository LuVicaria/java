package atividadePratica02;

import java.util.Scanner;

public class Pedidos {

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);

		int item, qtd;
		float valor;
		
		System.out.println("*************************************************************");
		System.out.println("*********************FAÇA SEU PEDIDO*************************");
		System.out.println("*1 - Cachorro Quente");
		System.out.println("*2 - X-Salada");
		System.out.println("*3 - X-Bacon");
		System.out.println("*4 - Bauru");
		System.out.println("*5 - Refrigerante ");
		System.out.println("*6 - Suco de laranja");
		System.out.println("*Digite o numero:");
		item = teclado.nextInt();
		System.out.println("*Quantidade:");
		qtd = teclado.nextInt();
		
		switch(item) {
		case 1:
			valor = 10;
			System.out.printf("Produto: Cachorro Quente %.2f", valor*qtd);
			break;
		case 2:
			valor = 15;
			System.out.printf("Produto: X-Salada %.2f", valor*qtd);
			break;
		case 3:
			valor = 18;
			System.out.printf("Produto: X-Bacon %.2f", valor*qtd);
			break;
		case 4:
			valor = 12;
			System.out.printf("Produto: Bauru %.2f", valor*qtd);
			break;
		case 5:
			valor = 8;
			System.out.printf("Produto: Refrigerante %.2f", valor*qtd);
			break;
		case 6:
			valor = 13;
			System.out.printf("Produto: Suco de laranja %.2f", valor*qtd);
			break;
		default:
			System.out.println("Opção inválida!");
		}

				teclado.close();
		}

	}

