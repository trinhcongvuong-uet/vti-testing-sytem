package com.vti.entities;

import java.time.LocalDate;

public class Exam {

	long examId;

	int code;

	String title;

	CategoryQuestion categoryQuestion;

	int duration;

	Account creator;

	LocalDate createDate;
	
	// Question 3
	/**
	 * print method
	 * Print Exam info: ID, title
	 * 
	 */
	void print() {
		System.out.println("Exam Info:");
		System.out.println("Exam ID: " + examId);
		System.out.println("Exam Title: " + title);
	}

}
