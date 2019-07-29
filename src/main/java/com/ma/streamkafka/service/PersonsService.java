package com.ma.streamkafka.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.ma.streamkafka.model.Person;
import com.ma.streamkafka.stream.PersonStreams;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PersonsService {
	private final PersonStreams personStreams;
	public PersonsService(PersonStreams personStreams) {
        this.personStreams = personStreams;
    }
    public void sendPerson(final Person person) {
        log.info("Sending person {}", person);
        MessageChannel messageChannel = personStreams.outboundPersons();
        messageChannel.send(MessageBuilder
                .withPayload(person)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
}

}
