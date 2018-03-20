package com.girish.cloudstreamkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.girish.cloudstreamkafka.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {

}
