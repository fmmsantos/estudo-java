package Colecoes;

import java.util.ArrayList;

public class Conjunto {
	/* Temos 4 interfaces basicas na Api Collection:
	 
	* Interface List = Forma lista de objetos, pode ter elementos repitidos. 
	 tem 3 implementacao: ArrayList,Vector,LinkdList
	 
	* Interface Set = representa um conjunto de objeto, NAO pode ter elementos repetidos.
	 tem 3 implementacao: hashSet,linkedHashSet,TreeSet
	 
	* Interface Queue = Ideal para implementacao de fila 
	 tem 3 implementacao:LinkdList,PriorityQueue
	
	 
	 Interface Map = Representa um grupo de Objetos, que possui identificador ou chave associada e cada objeto
	 dentro da Colecao
	 
	 
	 
	 
	*/
	

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		lista.add("Fabiana");
		lista.add("Fernanda");
		lista.add("Franciene");
		lista.add("Frank");
		lista.add("Francilene");
		lista.add("Franklena");
		System.out.println(lista.size());// quantidade de indice
		System.out.println(lista.isEmpty());// comparacao
		System.out.println(lista.remove(lista));//[Fabiana, Fernanda, Franciene, Frank, Francilene, Franklena]
		System.out.println(lista.contains(lista));
	
	}

}
