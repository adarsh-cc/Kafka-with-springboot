package com.kafkademo.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafkademo.deliveryboy.config.AppConstant;

@Service
public class KafkaService {
	
	@Autowired
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstant.LOCATION_TOPIC_NAME,location);
		return true;
	}

}
