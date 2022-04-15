package com.vti.entities;

import java.time.LocalDate;
import java.util.Random;

public class Excercise_4 {
	public static void main(String[] args) {
		Random random = new Random();

		// Question 1
		question_1(random);

		// Question 2
		question_2(random);

		// Question 3
		String[] studentNames = new String[3];
		studentNames[0] = "Trinh Cong Vuong";
		studentNames[1] = "Hoang Khanh Huyen";
		studentNames[2] = "Nghiem Van Truong";
		question_3(random, studentNames);

		// Question 4
		question_4(random);

		// Question 5
		question_5(random);

		// Question 6
		question_6(random);

		// Question 7
		question_7(random);
	}

	private static void question_1(Random random) {
		System.out.println("Random of integer: " + random.nextInt());
	}

	private static void question_2(Random random) {
		System.out.println("Random of real number: " + random.nextDouble());
	}

	private static void question_3(Random random, String[] names) {
		int index = random.nextInt(names.length);
		System.out.println("Student: " + names[index]);
	}

	private static void question_4(Random random) {
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		int randomDay = minDay + random.nextInt(maxDay - minDay);
		System.out.println(LocalDate.ofEpochDay(randomDay));
	}

	private static void question_5(Random random) {
		LocalDate today = LocalDate.now();
		int minDay = (int) today.minusYears(1).toEpochDay();
		int maxDay = (int) today.toEpochDay();
		int randomDay = minDay + random.nextInt(maxDay - minDay);
		System.out.println(LocalDate.ofEpochDay(randomDay));
	}

	private static void question_6(Random random) {
		LocalDate today = LocalDate.now();

		int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int maxDay = (int) today.toEpochDay();
		int randomDay = minDay + random.nextInt(maxDay - minDay);
		System.out.println(LocalDate.ofEpochDay(randomDay));
	}

	private static void question_7(Random random) {
		int intValue = 100 + random.nextInt(900);
		System.out.println("random value 100~999: " + intValue);
	}
}
