package com.demo.UrlShortner.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")

public class UrlShortner {
	
	@Autowired
	public com.demo.UrlShortner.service.UrlShort urlShortObject;
	
	@GetMapping("/url")
	public String index() {
		return "Welcome to URL Shortner!";
		
	}
	
	@PostMapping("/url")
	public String longToShort(@RequestParam String longUrl) {
		return urlShortObject.Shortner(longUrl);
	}
}