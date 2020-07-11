package br.com.udemy.java.secao19.exercicioresolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.udemy.java.secao19.exercicioresolvido.entities.LogEntry;

public class MainExerciseResolved {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter file full path: ");
		String path = scan.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<LogEntry> set = new HashSet<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(userName, moment));

				line = br.readLine();
			}

			System.out.println("Total Users: " + set.size());
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.getMessage());
		}

		scan.close();
	}

}
