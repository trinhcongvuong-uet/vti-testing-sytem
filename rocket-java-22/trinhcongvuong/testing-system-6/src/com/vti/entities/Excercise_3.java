package com.vti.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Excercise_3 {

	public static void main(String[] args) {
		Exam exam = new Exam();
		exam.examId = 1L;
		exam.title = "Exam title";
		exam.createDate = LocalDateTime.now();
		// Question 1
		question_1(exam);

		// Question 2
		question_2(exam);

		// Question 3
		question_3(exam);

		// Question 4
		question_4(exam);

		// Question 5
		question_5(exam);
	}

	private static void question_1(Exam exam) {
		System.out.println("Exam ID: " + exam.examId);
		System.out.println("Exam Title: " + exam.title);
		String pattern = "dd/MM/yyy hh'h':mm'p':ss's'";
		String createDate = formatDate(exam.createDate, pattern);
		System.out.println("Create Date: " + createDate);
	}

	private static void question_2(Exam exam) {
		String pattern = "yyyy/MM/dd hh'h':mm'p':ss's'";
		String createDate = formatDate(exam.createDate, pattern);
		System.out.println("Create Date: " + createDate);
	}

	private static void question_3(Exam exam) {
		System.out.println("Year Of Create Date: " + exam.createDate.getYear());
	}

	private static void question_4(Exam exam) {
		String pattern = "yyyy/MM";
		String createDate = formatDate(exam.createDate, pattern);
		System.out.println("Year/Month Of Create Date: " + createDate);
	}

	private static void question_5(Exam exam) {
		String pattern = "MM-YY";
		String createDate = formatDate(exam.createDate, pattern);
		System.out.println("MM/YY Of Create Date: " + createDate);
	}

	private static String formatDate(LocalDateTime localDate, String pattern) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(pattern);
		return dateFormat.format(localDate);
	}

}
