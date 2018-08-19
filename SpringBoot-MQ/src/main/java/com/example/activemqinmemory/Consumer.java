package com.example.activemqinmemory;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements MessageListener {
	
	@JmsListener(destination ="inmemory.queue")
	public void listener(String message) {
		System.out.println("Recieved Message "+message);
	}

	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		
	}

}
