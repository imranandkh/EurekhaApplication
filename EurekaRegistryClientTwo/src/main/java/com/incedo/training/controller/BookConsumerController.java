package com.incedo.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookConsumerController {

	 @Autowired
	 RestTemplate restTemplate;
//	 
	@GetMapping("/secondClient")
	public String getBooksByCallingClientOne() {
		String bookListString="test_alsone";
		System.out.println(restTemplate+ "  s.ops");
	  bookListString=restTemplate.getForObject("http://localhost:8098/clientOne",String.class);
		// bookListString=restTemplate.getForObject("http://localhost:8080/secondClient",String.class);

		 return bookListString;
	}
	
	
}
