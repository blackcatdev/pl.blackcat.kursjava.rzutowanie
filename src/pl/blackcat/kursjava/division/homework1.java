package pl.blackcat.kursjava.division;

//Write a program that asks a user for integer input, display the result of multiplying this number and the constant pi (Math.PI). Display the result as an integer and floating point number.

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbe do mnozenia przez pi: ");
		double value = getValue.getValue(scanner);
		System.out.println("Wynik mnożenia całkowitego: " + value * (int) Math.PI);
		System.out.println("Wynik mnożenia rzeczywistego: " + value * Math.PI);


	}


}
