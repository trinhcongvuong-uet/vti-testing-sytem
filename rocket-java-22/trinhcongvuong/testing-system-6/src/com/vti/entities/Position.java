package com.vti.entities;

public class Position {

	long positionId;

	PositionNameEnum positionName;

	// Question 3
	/**
	 * method print
	 * print info of Position: id, name
	 */
	void print() {
		System.out.println("Position Info:");
		System.out.println("Position ID: " + positionId);
		System.out.println("Position Name: " + positionName);
	}

}
