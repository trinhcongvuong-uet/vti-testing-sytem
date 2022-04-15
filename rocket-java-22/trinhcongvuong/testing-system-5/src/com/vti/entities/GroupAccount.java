package com.vti.entities;

import java.time.LocalDateTime;

public class GroupAccount {

	Group group;

	Account account;

	LocalDateTime joinDate;
	
	// Question 3
		/**
		 * print method
		 * Print GroupAccount info: Group, Account
		 */
		void print() {
			System.out.println("GroupAccount Info:");
			group.print();
			account.print();
		}

}
