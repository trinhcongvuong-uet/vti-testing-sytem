package com.vti.entities;

import java.time.LocalDateTime;

public class Account {

	public long accountId;

	public String email;

	public String userName;

	public String fullName;

	Department department;

	Position position;

	LocalDateTime createDate;
	
	
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
