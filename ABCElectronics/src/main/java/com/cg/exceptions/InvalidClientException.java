package com.cg.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class InvalidClientException extends Exception 
{

	public InvalidClientException() 
	{
		super();
	
	}
	
}
