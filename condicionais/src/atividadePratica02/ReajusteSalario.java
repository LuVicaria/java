package atividadePratica02;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codCargo;
		double valor;
		String nome;
		float salario;
		
		System.out.println("*************************************************************");
		System.out.println("*******************CÁLCULO DE REAJUSTE***********************");
		System.out.println("*Digite o seu nome:");
		nome = teclado.next();
		System.out.println("*Digite o código do cargo:");
		System.out.println("*1 - Gerente");
		System.out.println("*2 - Vendedor");
		System.out.println("*3 - Supervisor");
		System.out.println("*4 - Motorista");
		System.out.println("*5 - Estoquista");
		System.out.println("*6 - Técnico de TI");
		codCargo = teclado.nextInt();
		System.out.println("*Digite o valor do seu salário:");
		salario = teclado.nextFloat();
	
		switch(codCargo) {
		case 1:
			valor = 1.10;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		case 2:
			valor = 1.07;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor/n");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		case 3:
			valor = 1.09;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor/n");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		case 4:
			valor = 1.06;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista/n");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		case 5:
			valor = 1.05;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista/n");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		case 6:
			valor = 1.08;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI/n");
			System.out.println("Salário Reajustado: " + salario * valor);
			break;
		default:
			System.out.println("Opção inválida!");
		}

				teclado.close();
		}
	}

