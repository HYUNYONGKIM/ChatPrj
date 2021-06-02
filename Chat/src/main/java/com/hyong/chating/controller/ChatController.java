package com.hyong.chating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {
	
	//새로운 브랜치
	@RequestMapping("/chat")
	public String chat() {
		return "chat";
	}
}
