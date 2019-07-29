package com.ma.streamkafka.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ma.streamkafka.model.Person;
import com.ma.streamkafka.stream.PersonStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonListener {
	 @StreamListener(PersonStreams.INPUT)
	    public void handleGreetings(@Payload Person person) {
	        log.info("Received person: {}", person);
	    }
}
