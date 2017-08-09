package com.example.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entities.Message;
import com.example.entities.OutputMessage;

@Controller
public class MessageController {
	
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage sendMessage(Message message) throws Exception{
		String time = new SimpleDateFormat("HH:mm").format(new Date());
		
		return new OutputMessage(message.getFrom(), message.getText() , time);
	}
	
	@GetMapping("/")
	public String showPage(){
		
		return "index";
	}
}
