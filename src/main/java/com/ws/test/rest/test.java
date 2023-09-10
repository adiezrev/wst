package com.ws.test.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class test {

	@RequestMapping(method = {RequestMethod.GET}, path = "/test")
	public String executeFunctionPost() {
		
		return "OK, recibido ...";
	}
	
}
