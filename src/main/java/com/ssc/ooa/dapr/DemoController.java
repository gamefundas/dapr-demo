package com.ssc.ooa.dapr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello from Dapr Application";
	}

}
