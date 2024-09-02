package com.producer.controller;

import com.producer.service.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
	private ProduceService produceService;
	@GetMapping("producer")
	public String callProducer(@RequestParam String message) {
		produceService.produce(message);
		return "ok";
	}
}