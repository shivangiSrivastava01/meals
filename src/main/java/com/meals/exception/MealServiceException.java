package com.meals.exception;

public class MealServiceException extends RuntimeException {

	public MealServiceException(String exceptionMessage) {
		super(exceptionMessage);
	}

	public MealServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
