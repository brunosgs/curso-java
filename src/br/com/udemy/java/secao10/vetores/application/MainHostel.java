package br.com.udemy.java.secao10.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao10.vetores.entities.RentRoom;

public class MainHostel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		RentRoom[] rent = new RentRoom[10];

		int numberOfGuests;
		String name;
		String email;
		int roomNumber;

		System.out.print("How many rooms will be rented?: ");
		numberOfGuests = scan.nextInt();

		for (int i = 0; i < numberOfGuests; i++) {
			scan.nextLine();
			System.out.printf("Rent #%d: ", i + 1);
			System.out.print("\nName: ");
			name = scan.nextLine();
			System.out.print("Email: ");
			email = scan.nextLine();
			System.out.print("Room: ");
			roomNumber = scan.nextInt();

			while (rent[roomNumber] != null) {
				System.out.println("Room is already booked, choose another room!");
				System.out.print("Room: ");
				roomNumber = scan.nextInt();
			}

			if (rent[roomNumber] == null) {
				rent[roomNumber] = new RentRoom(name, email);
			}
			System.out.println("----------------------");
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i]);
			}
		}

		scan.close();
	}

}
