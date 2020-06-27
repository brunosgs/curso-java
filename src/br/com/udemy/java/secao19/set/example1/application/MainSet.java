package br.com.udemy.java.secao19.set.example1.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {

//		 - HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado;
//		 - TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator);
//		 - LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados.

		Set<String> set = new LinkedHashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println("Lista:");
		for (String s : set) {
			System.out.println(s);
		}

		set.removeIf(x -> x.length() >= 3);

		System.out.println("\n\nTeste removeIf - Remove da lista os itens que s�o menores que 3 caracteres");
		for (String s : set) {
			System.out.println(s);
		}

		set.add("Tablet");
		set.add("Notebook");

		set.removeIf(x -> x.charAt(0) == 'T');

		System.out.println("\nTeste removeIf - Remove da lista os itens que iniciam com a leta 'T'");
		for (String s : set) {
			System.out.println(s);
		}
	}

}
