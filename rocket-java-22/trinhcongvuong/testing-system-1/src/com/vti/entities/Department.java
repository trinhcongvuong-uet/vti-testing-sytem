package com.vti.entities;

public class Department {

	long departmentId;

	String departmentName;

	// Question 3
	/**
	 * method print
	 * Print Department info: ID, Name
	 */
	void print() {
		System.out.println("Department Info:");
		System.out.println("Department ID: " + departmentId);
		System.out.println("Department Name: " + departmentName);
	}
}
