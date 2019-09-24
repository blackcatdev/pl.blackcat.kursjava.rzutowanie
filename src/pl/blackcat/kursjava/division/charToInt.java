package pl.blackcat.kursjava.division;

//Write a program that asks user for a char input, convert it to int and print the result. Compare it to ASCII table.

import java.util.Scanner;

public class charToInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj znak: ");
		char character = getValue.getChar(scanner);
		System.out.println("Znak " + character + " po konwersji na int to: " + (int) character);


	}
}
