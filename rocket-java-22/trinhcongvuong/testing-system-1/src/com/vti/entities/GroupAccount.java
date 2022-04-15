package com.vti.entities;

import java.time.LocalDate;

public class GroupAccount {

	Group group;

	Account account;

	LocalDate joinDate;
	
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
