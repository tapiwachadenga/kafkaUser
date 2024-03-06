package io.tapiwa.springbootkafkatutorial.kafka;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.tapiwa.springbootkafkatutorial.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics = "javaguides_json", groupId = "myGroup")
	public void consume(User user) {
		LOGGER.info(String.format("Json message received -> %s", user.toString()));
	}
}
