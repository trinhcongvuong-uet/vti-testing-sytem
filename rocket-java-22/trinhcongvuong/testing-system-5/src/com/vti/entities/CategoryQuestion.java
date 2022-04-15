package com.vti.entities;

public class CategoryQuestion {

	long categoryId;

	String categoryName;

	// Question 3
	/**
	 * method print
	 * Print CategoryQuestion info: ID, Name
	 */
	void print() {
		System.out.println("CategoryQuestion Info:");
		System.out.println("Category ID: " + categoryId);
		System.out.println("Category Name: " + categoryName);
	}
}
