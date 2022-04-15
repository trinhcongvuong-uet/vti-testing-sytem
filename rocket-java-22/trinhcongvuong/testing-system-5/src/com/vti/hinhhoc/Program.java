package com.vti.hinhhoc;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.vti.entities.Student;
import com.vti.exceptions.InvalidAgeException;

public class Program {

	public static void main(String[] args) {
		try {
			enterStudent();
		} catch (InputMismatchException e) {
			System.out.println("Tuoi phai la integer");
		} catch (InvalidAgeException e) {
			System.out.println("Tuoi phai lon hon bang 18");
		}
	}

	private static Student enterStudent() throws InvalidAgeException, InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scanner.nextLine();

		System.out.println("Enter age");
		int age = scanner.nextInt();

		if (age < 18) {
			throw new InvalidAgeException();
		}

		return new Student(name, age);
	}

}
