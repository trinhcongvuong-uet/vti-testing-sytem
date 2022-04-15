package com.vti.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Excercise_2 {

	public static void main(String[] args) {
		// question 1
		question_1();

		// question 2
		question_2();

		// question 3
		question_3();

		// question 4
		question_4();

		// question 5
		question_5();

		// question 6
		Department department = new Department();
		department.departmentId = 1L;
		department.departmentName = "Department " + 1;

		Account account = new Account();
		account.accountId = 1L;
		account.email = String.format("email%s@gmail.com", 1);
		account.fullName = String.format("Account %s", 1);
		account.department = department;
		question_6(account);

	}

	private static void question_1() {
		int intValue = 5;
		System.out.printf("Int value = %d%n", intValue);
	}

	private static void question_2() {
		long longValue = 1000000000;
		System.out.printf("Long value = %,d%n", longValue);

	}

	private static void question_3() {
		float floatvalue = 5.567098f;
		System.out.printf("Float value = %.4f%n", floatvalue);
	}

	private static void question_4() {
		String name = "Trinh Cong Vuong";
		System.out.printf("Ten toi la \"%s\" va toi doc than%n", name);
	}

	private static void question_5() {
		Date today = Calendar.getInstance().getTime();
		String pattern = "dd/mm/yyy hh'h':mm'p':ss's'";
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		System.out.println(dateFormat.format(today));
	}

	private static void question_6(Account account) {
		System.out.println("Email\t\t\tFull name\tPhòng ban");
		System.out.print(account.email + "\t" + account.fullName + "\t" + account.department.departmentName);
	}

}
