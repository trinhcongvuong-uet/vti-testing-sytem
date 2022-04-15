package com.vti.exceptions;

public class InvalidAgeException extends RuntimeException {

	private static final String MESSAGE_ERROR = "AAAAAAAAAAAAAAAA";

	public InvalidAgeException() {
		super(MESSAGE_ERROR);
	}

}
