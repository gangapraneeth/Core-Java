package ControlStatements;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		// With Scanner.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("You Are Eligible to Vote.");
		}
		else {
			System.out.println("You Are Not Eligible to Vote.");
		}
		
		scanner.close();

	}

}
