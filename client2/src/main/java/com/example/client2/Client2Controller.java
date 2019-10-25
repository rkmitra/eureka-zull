package com.example.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
	
	@Value("${eureka.instance.instanceId}")
	private String id;
	
	@RequestMapping(method = RequestMethod.GET, path = "/message")
	public ResponseEntity message()
	{
		return new ResponseEntity("response from " + id, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
