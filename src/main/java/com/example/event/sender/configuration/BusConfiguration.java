package com.example.event.sender.configuration;

import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RemoteApplicationEventScan({"com.example.event.sender.model"})
public class BusConfiguration {
}
