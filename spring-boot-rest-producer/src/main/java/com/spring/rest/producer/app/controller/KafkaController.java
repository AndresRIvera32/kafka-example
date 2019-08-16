package com.spring.rest.producer.app.controller;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.producer.app.producer.ProducerKafka;

@RestController
public class KafkaController {

	@Autowired
	Environment env;
	
	@Autowired
	ProducerKafka producer;
	
	/**
	 * Test this app with request type: http://localhost:8082/send?input=prueba
	 * @param message
	 * @return
	 */
	@GetMapping("/send")
	public String sendMessage(@RequestParam("input") String message) {
		producer.sendMessage(message);
		return env.getProperty("message.response");
	}

}
