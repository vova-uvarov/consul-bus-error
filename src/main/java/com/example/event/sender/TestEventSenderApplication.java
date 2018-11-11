package com.example.event.sender;

import com.example.event.sender.model.CustomRemoteEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
@EnableDiscoveryClient
public class TestEventSenderApplication implements ApplicationRunner {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(TestEventSenderApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventPublisher.publishEvent(new CustomRemoteEvent("customValue", this, "test-event-sender:**", "oauth-server:**"));
    }
}
