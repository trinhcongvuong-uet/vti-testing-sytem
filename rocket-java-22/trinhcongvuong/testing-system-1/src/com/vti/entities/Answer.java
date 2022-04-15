package com.vti.entities;

public class Answer {

	long answerId;

	String content;

	Question question;

	boolean isCorrect;

	// Question 3
	/**
	 * method print
	 * Print Answer info: id, content
	 */
	void print() {
		System.out.println("Answer Info:");
		System.out.println("Answer ID: " + answerId);
		System.out.println("Content: " + content);
	}
}
