package br.com.udemy.java.secao19.set.example2.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MainSet2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		System.out.print("Conjunto 'a': [");
		for (Integer i : a) {
			System.out.print(i + " ");
		}
		System.out.print("]");

		System.out.print("\n\nConjunto 'b': [");
		for (Integer i : b) {
			System.out.print(i + " ");
		}
		System.out.print("]");

		// Union
		Set<Integer> c = new TreeSet<>(a);

		c.addAll(b);
		System.out.println("\n\nUnion: " + c);

		// Intersection
		Set<Integer> d = new TreeSet<>(a);

		d.retainAll(b);
		System.out.println("Interserction: " + d);

		// Difference
		Set<Integer> e = new TreeSet<>(a);

		e.removeAll(b);
		System.out.println("Difference: " + e);
	}

}
