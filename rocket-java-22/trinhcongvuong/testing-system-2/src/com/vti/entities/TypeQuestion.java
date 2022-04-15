package com.vti.entities;

public class TypeQuestion {

	long typeId;

	TypeQuestEnum typeName;

	// Question 3
	/**
	 * method print
	 * print info of TypeQuestion: id, name
	 */
	void print() {
		System.out.println("TypeQuestion Info:");
		System.out.println("TypeQuestion ID: " + typeId);
		System.out.println("TypeQuestion Name: " + typeName);
	}

}
