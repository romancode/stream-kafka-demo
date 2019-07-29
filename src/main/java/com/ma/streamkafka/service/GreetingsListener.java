package com.ma.streamkafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ma.streamkafka.model.Greetings;
import com.ma.streamkafka.stream.GreetingsStreams;



@Service
@Slf4j
public class GreetingsListener {
	 @StreamListener(GreetingsStreams.INPUT)
	    public void handleGreetings(@Payload Greetings greetings) {
	        log.info("Received greetings: {}", greetings);
	    }
}
