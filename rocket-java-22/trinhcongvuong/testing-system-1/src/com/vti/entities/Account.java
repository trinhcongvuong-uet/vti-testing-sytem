package com.vti.entities;

import java.time.LocalDate;

public class Account {

	long accountId;

	String email;

	String userName;

	String fullName;

	Department department;

	Position position;

	LocalDate createDate;
	
	
	// Question 3
	/**
	 * method print
	 * print info of account: id, username
	 */
	void print() {
		System.out.println("Account Info:");
		System.out.println("Account ID: " + accountId);
		System.out.println("User Name: " + userName);
	}
}
