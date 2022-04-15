package com.vti.entities;

import java.time.LocalDateTime;

public class Account {

	public static long currentId = 0;

	long accountId;

	String email;

	String userName;

	String fullName;

	Department department;

	Position position;

	LocalDateTime createDate;

	public Account() {
		auto();
	}
	
	

	public Account(String userName) {
		auto();
		this.userName = userName;
	}
	
	public long auto() {
		currentId++;
		accountId = currentId;
		return currentId;
	}



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
