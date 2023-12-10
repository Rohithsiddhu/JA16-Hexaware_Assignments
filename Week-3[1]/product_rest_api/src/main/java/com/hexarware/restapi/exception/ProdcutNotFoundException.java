package com.hexarware.restapi.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class ProdcutNotFoundException extends ResponseStatusException
{

	public ProdcutNotFoundException(HttpStatusCode status, String msg) {
		super(status, msg);
		// TODO Auto-generated constructor stub
	}
    
}
