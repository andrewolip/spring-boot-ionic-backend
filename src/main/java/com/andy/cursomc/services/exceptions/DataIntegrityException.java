package com.andy.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 91280287294718434L;

	public DataIntegrityException(String message) {
		super(message);
	}

	public DataIntegrityException(String message, Throwable cause) {
		super(message, cause);
	}

}
