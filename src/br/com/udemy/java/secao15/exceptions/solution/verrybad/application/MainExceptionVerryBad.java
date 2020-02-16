package br.com.udemy.java.secao15.exceptions.solution.verrybad.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.java.secao15.exceptions.solution.verrybad.model.entities.Reservation;

public class MainExceptionVerryBad {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = scan.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(scan.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(scan.next());

		if (!checkOut.after(checkIn)) { // Verifica se a data de entrada é maior que a date de saída.
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);

			System.out.println("Resevation: " + reservation);

			System.out.println("\nEnter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(scan.next());

			Date now = new Date();

			if (checkIn.before(now) || checkOut.before(now)) { // Verifica se a data menor que a data atual
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Resevation: " + reservation);
			}
		}

		scan.close();
	}

}
