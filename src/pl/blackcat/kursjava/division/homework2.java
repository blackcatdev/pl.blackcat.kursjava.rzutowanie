package pl.blackcat.kursjava.division;

//Ask user for two integers. Display the result of their division along with the fractional part.

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj pierwszą liczbę: ");
		int Value1 = (int) getValue.getValue(scanner);
		System.out.print("Podaj drugą liczbę: ");
		int Value2 = (int) getValue.getValue(scanner);

		System.out.println("Wynik dzielenia całkowitego podanych liczb to: " + Value1 / Value2);
		System.out.println("Wynik dzielenia rzeczywistego podanych liczb to: " + (double) Value1 / Value2);

	}

}
