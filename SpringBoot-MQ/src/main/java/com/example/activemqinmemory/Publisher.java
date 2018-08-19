package com.example.activemqinmemory;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {
	
	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	Queue queue;
	
	@GetMapping("/rest/publish/{message}")
	public String publish(@PathVariable("message") String message) {
		jmsTemplate.convertAndSend(queue, message);
		return "published Message SuccessFully " + message;
		
	}
	

}
