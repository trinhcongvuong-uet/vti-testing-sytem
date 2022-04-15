package com.vti.utils;

import java.util.Scanner;

import com.vti.exceptions.InvalidAgeException;

public abstract class ScannerUtils {
	public static int inputInt() {
		int intValue = 0;
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter integer:");
				String stringValue = scanner.nextLine();

				intValue = Integer.valueOf(stringValue).intValue();

				break;

			} catch (NumberFormatException e) {
				throw new InvalidAgeException();
			}
		}
		return intValue;
	}

	public static float inputFloat() {
		return 1.0f;
	}

}
