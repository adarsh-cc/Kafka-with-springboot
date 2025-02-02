package com.kafkademo.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics=AppConstant.LOCATION_UPDATE_TOPIC,groupId=AppConstant.GROUP_ID)
	public void updateLocation(String value) {
		
		System.out.println("New Location: "+value);
		
	}

}
