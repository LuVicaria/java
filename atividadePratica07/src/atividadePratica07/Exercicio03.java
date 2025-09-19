package atividadePratica07;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		// instanciando a colectionSet
		Set<Integer> valoresInteiros = new HashSet<Integer>();
		// contador; valor de comparação; atualiza contador
		for (int i = 0; i < 10; i ++) {
			System.out.println("Digite um valor:");
			numero = teclado.nextInt();
			valoresInteiros.add(numero);
		}
		
		System.out.printf("Listar os dados do set: %n");
		
		//Instanciando o iterator para 'andar' pelo array
		Iterator<Integer> iteValoresInteiros = valoresInteiros.iterator();
		
		//Valores dos iterator descritos na tela
		while (iteValoresInteiros.hasNext()) {
		System.out.println(iteValoresInteiros.next());
		}
	
		teclado.close();
	}
}