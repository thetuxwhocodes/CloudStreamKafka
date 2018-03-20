package com.girish.cloudstreamkafka.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.girish.cloudstreamkafka.model.Greetings;
import com.girish.cloudstreamkafka.stream.GreetingsStreams;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}
