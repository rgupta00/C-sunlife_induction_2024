package com.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProduceService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void produce(String message) {
		System.out.println("message is send....");
		kafkaTemplate.send("my_topic", message);
	}
}
