package br.com.udemy.java.secao20.pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPipeline {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream().map(x -> x * 10);

		System.out.println(Arrays.toString(st1.toArray()));

		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);

		/*
		 * Ao utilizar esse modelo de pipeline, foi filtrado os números pares, depois
		 * multiplicados os números filtrados por 10 e depois convertido as stream
		 * criada para uma list.
		 */
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

		System.out.println(Arrays.toString(newList.toArray()));
	}

}
