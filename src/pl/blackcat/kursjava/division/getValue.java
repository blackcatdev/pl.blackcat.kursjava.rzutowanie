package pl.blackcat.kursjava.division;

import java.util.InputMismatchException;
import java.util.Scanner;

class getValue {

	static double getValue(Scanner scanner){
		while (true) {
			try {
				return scanner.nextDouble();
			} catch (InputMismatchException exception) {
				System.out.println("To co podałeś, zdecydowanie nie jest liczbą.");
				System.out.print("Sprobuj jeszcze raz: ");
				scanner.next();
			}

		}
	}
}
