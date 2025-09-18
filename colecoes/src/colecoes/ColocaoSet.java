package colecoes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColocaoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> frutas = new HashSet<String>();

		frutas.add("Banana");
		frutas.add("Maça");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		System.out.println(frutas);

			for(String fruta : frutas) {
				System.out.println(fruta.hashCode());
			}
			
			frutas.remove("Abacate");
			
			System.out.println(frutas);
			
			System.out.println("A fruta Amora está presente no set? " + frutas.contains("Amora"));
			
			System.out.println("O set está vazio? " + frutas.isEmpty());
			
			// iterator
			Iterator<String> itFrutas = frutas.iterator();
			
			frutas.add("Kiwi");

			/*while (itFrutas.hasNext()) {
				System.out.println(itFrutas.next());
			}*/
			//Adiciona todos os elementos da coleção Set no ArrayList
			ArrayList<String> frutasList = new ArrayList<String>();
			
			//Ordenação dos dados em ordem Crescente
			frutasList.sort(null);
			
			//Lista os dados do ArrayList
			frutasList.addAll(frutasList);
			
			//Ordenacao dos dados em ordem decrescente
			frutasList.sort(Comparator.reverseOrder());

		
			System.out.println(frutasList);
			
	}

	
}
