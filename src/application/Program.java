package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// set<T> é um tipo genérico ( Representa um conjunto de elementos (similar ao da Álgebra)
		// set é uma interface na verdade e tem umas implementações = 1º HashSet (+rápido) 2º TreeSet (+lento) 3º LinkedHashSet (intermediario)
		Set<String> set = new LinkedHashSet<>();
		// HashSet não mantem a ordem dos arquivos
		// TreeSet ordena os dados 
		//LinkedHashSet ordena os arquivos
		
		set.add("Tv"); // Segunda letra maiuscula tem prioridade
		set.add("Tablet"); // Observação troquei a ordem e o resultado mudou
		set.add("Notebook");
		
		set.remove("Tablet"); // Observação: Nome tem que ser igual para remover

		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
		}
		
	}

}
