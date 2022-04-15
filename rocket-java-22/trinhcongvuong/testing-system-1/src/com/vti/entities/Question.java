package com.vti.entities;

import java.time.LocalDate;

public class Question {

	long questionId;

	String content;

	CategoryQuestion category;

	TypeQuestion type;

	Account creator;

	LocalDate createDate;
	
	// Question 3
		/**
		 * method print
		 * print info of Question: id, content
		 */
		void print() {
			System.out.println("Question Info:");
			System.out.println("Question ID: " + questionId);
			System.out.println("Question Content: " + content);
		}

}
