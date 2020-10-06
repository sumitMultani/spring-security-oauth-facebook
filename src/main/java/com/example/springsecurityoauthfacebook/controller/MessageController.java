package com.example.springsecurityoauthfacebook.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@SuppressWarnings("unchecked")
	@GetMapping("/")
	public String getMessage(Principal principal) {
		 Map<String, Object> details = (Map<String, Object>)
	                ((OAuth2Authentication) principal).getUserAuthentication().getDetails();
	        String userName = (String) details.get("name");
	        return "Hi " + userName + " Welcome to Gain Java Knowledge !!";
	}
}
