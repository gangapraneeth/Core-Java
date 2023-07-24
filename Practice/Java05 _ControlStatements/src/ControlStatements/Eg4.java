package ControlStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg4 {

	public static void main(String[] args) throws IOException {
		
		//BufferReader is a Class
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Age: ");
		String userAge = reader.readLine();
		
		//Casting (Converting String To Integer):
		
		int age = Integer.parseInt(userAge);
		if (age >= 18) {
			System.out.println("You Are Eligible to Vote.");
		}
		else {
			System.out.println("You Are Not Eligible to Vote.");
		}
		
		reader.close();

	}

} 
