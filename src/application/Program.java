package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// set<T> é um tipo genérico ( Representa um conjunto de elementos (similar ao da Álgebra)
		// set é uma interface na verdade e tem umas implementações = 1º HashSet (+rápido) 2º TreeSet (+lento) 3º LinkedHashSet (intermediario)
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}

}
