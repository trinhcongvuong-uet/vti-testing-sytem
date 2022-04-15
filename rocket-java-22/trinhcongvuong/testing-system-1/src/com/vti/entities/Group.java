package com.vti.entities;

import java.time.LocalDate;

public class Group {

	long groupId;

	String groupName;

	Account creator;

	LocalDate createDate;

	// Question 3
	/**
	 * method print
	 * print info of Group: id, name
	 */
	void print() {
		System.out.println("Group Info:");
		System.out.println("Group ID: " + groupId);
		System.out.println("Group Name: " + groupName);
	}
}
