package com.girish.cloudstreamkafka.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.girish.cloudstreamkafka.model.Greetings;
import com.girish.cloudstreamkafka.service.GreetingsService;

@RestController
public class GreetingsController {
	private final GreetingsService greetingsService;

	public GreetingsController(GreetingsService greetingsService) {
		this.greetingsService = greetingsService;
	}

	@GetMapping("/greetings")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void greetings(@RequestParam("message") String message) {
		Greetings greetings = new Greetings(System.currentTimeMillis(), message);
		greetingsService.sendGreeting(greetings);
	}
}
