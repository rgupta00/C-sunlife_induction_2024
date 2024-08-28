package com.sunlife.productapp.exceptions;

public class DataValidationException extends RuntimeException {
	private static final long serialVersionUID = 5879485364886328672L;

	public DataValidationException(String message) {
		super(message);
	}

}
