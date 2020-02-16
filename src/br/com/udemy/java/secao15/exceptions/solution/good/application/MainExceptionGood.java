package br.com.udemy.java.secao15.exceptions.solution.good.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao15.exceptions.solution.good.model.entities.Reservation;
import br.com.udemy.java.secao15.exceptions.solution.good.model.exceptions.DomainException;

public class MainExceptionGood {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int roomNumber = scan.nextInt();
			System.out.print("Check-in date (DD/MM/YYYY): ");
			Date checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			Date checkOut = sdf.parse(scan.next());

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Resevation: " + reservation);

			System.out.println("\nEnter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(scan.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Resevation: " + reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("unexpected error: " + e);
		}

		scan.close();
	}
}
