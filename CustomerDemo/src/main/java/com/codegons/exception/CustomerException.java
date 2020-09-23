package com.codegons.exception;

public class CustomerException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public CustomerException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public CustomerException() {
		super();
	}
}
