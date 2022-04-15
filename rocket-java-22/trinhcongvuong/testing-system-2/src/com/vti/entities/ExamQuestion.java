package com.vti.entities;

public class ExamQuestion {

	Exam exam;

	Question question;

	// Question 3
	/**
	 * print method
	 * Print ExamQuestion info: Exam, Question
	 */
	void print() {
		System.out.println("ExamQuestion Info:");
		exam.print();
		question.print();
	}

}