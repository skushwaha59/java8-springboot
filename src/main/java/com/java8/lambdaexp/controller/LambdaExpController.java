package com.java8.lambdaexp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java8.lambdaexp.service.LambdaExpInterface;

@RestController
public class LambdaExpController {
	
	@GetMapping("/lambdaexp/{number}")
	public ResponseEntity getLambdaExp(@PathVariable("number") int number) {
		LambdaExpInterface expInterface = (int x) -> result(x);
		Integer result = expInterface.abstractFunc(number);
		LambdaExpInterface expInterface1 = (int x) -> resultadd(x);
		Integer result2 = expInterface1.abstractFunc(number);
		return new ResponseEntity(result+result2, HttpStatus.OK);
		
	}
	
	private int result(int x) {
		return x%2;
	}
	
	private int resultadd(int x) {
		return x+2;
	}
	

}
