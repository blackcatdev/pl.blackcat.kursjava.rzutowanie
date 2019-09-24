package pl.blackcat.kursjava.division;

//Write a program that asks a user for integer input, display the result of multiplying this number and the constant pi (Math.PI). Display the result as an integer and floating point number.

import java.util.InputMismatchException;
import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double value = getValue(scanner);
		System.out.println("Wynik mnożenia całkowitego: " + value * (int) Math.PI);
		System.out.println("Wynik mnożenia rzeczywistego: " + value * Math.PI);


	}

	private static double getValue(Scanner scanner) {
		while (true) {
			System.out.print("Podaj liczbe do mnozenia przez pi: ");
			try {
				return scanner.nextDouble();
			} catch (InputMismatchException exception) {
				System.out.println("To co podałeś, zdecydowanie nie jest liczbą.");
				scanner.next();

			}
		}
	}


}
