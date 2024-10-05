package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a); // c = cópia do conjunto a
		c.addAll(b); // união do conjunto c com o conjunto b
		System.out.println(c); // mostrar o resultado na tela
		
		//intersection
		Set<Integer> d = new TreeSet<>(a); // d = cópia do conjunto a
		d.retainAll(b);  // O que d tem em comum com a
		System.out.println(d); // mostrar o resultado na tela
		
		//difference
		Set<Integer> e = new TreeSet<>(a); // e = cópia do conjunto a
		e.removeAll(b); // remover do conjunto e todo mundo que esta no conjunto b
		System.out.println(e); // mostrar o resultado na tela
		
		
		
		
		/*
		// set<T> é um tipo genérico ( Representa um conjunto de elementos (similar ao da Álgebra)
		// set é uma interface na verdade e tem umas implementações = 1º HashSet (+rápido) 2º TreeSet (+lento) 3º LinkedHashSet (intermediario)
		Set<String> set = new LinkedHashSet<>();
		// HashSet não mantem a ordem dos arquivos
		// TreeSet ordena os dados 
		//LinkedHashSet ordena os arquivos
		
		set.add("Tv"); // Segunda letra maiuscula tem prioridade
		set.add("Tablet"); // Observação troquei a ordem e o resultado mudou
		set.add("Notebook");
		
		// set.remove("Tablet"); // Observação: Nome tem que ser igual para remover
		// set.removeIf(x -> x.length() >= 3); // Remove todos que tem mais de 3 caracter
		set.removeIf(x -> x.charAt(0) == 'T'); // Remover todos que começam com a letra T
		
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		*/
	}

}
