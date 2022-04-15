package com.vti.entities;

public class Excercise_1 {

	public static void main(String[] args) {
		Account account1 = new Account();
//		System.out.println("Account ID 1:" + account1.accountId);
		account1.auto();
		
		System.out.println("Current Id1 lan 1:" + Account.currentId);

		Account account2 = new Account();
//		System.out.println("Account ID 2:" + account2.accountId);
		
		System.out.println("Current Id lan 2:" + Account.currentId);
		
		System.out.println("Current Id lan :" + Account.currentId);

	}
}
