package br.com.udemy.java.secao19.map.exercise.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class MainExercicioProposto {

	public static void main(String[] args) {
		String path = "D:\\workspace\\ws-udemy\\curso-programacao\\src\\br\\com\\udemy\\java\\secao19\\map\\exercise\\in.csv";
		Map<String, Integer> candidatos = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String candidato = br.readLine();

			while (candidato != null) {
				String[] itemCandidato = candidato.split(",");

				if (candidatos.containsKey(itemCandidato[0])) {
					Integer sum = candidatos.get(itemCandidato[0]) + Integer.parseInt(itemCandidato[1]);

					candidatos.put(itemCandidato[0], sum);
				} else {
					candidatos.put(itemCandidato[0], Integer.parseInt(itemCandidato[1]));
				}

				candidato = br.readLine();
			}

			for (String key : candidatos.keySet()) {
				System.out.println(key + ": " + candidatos.get(key));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
