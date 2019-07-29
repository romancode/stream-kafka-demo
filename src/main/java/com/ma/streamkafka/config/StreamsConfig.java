package com.ma.streamkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.ma.streamkafka.stream.GreetingsStreams;
import com.ma.streamkafka.stream.PersonStreams;

@EnableBinding(value= {GreetingsStreams.class , PersonStreams.class})
public class StreamsConfig {

}
