package com.ma.streamkafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PersonStreams {
	String INPUT = "persons-in";
    String OUTPUT = "persons-out";
    
    @Input(INPUT)
    SubscribableChannel inboundPersons();
    @Output(OUTPUT)
    MessageChannel outboundPersons();
}
