package com.example.event.sender.model;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class CustomRemoteEvent extends RemoteApplicationEvent {
    private String customField;

    public CustomRemoteEvent(String customField, Object source, String originService, String destinationService) {
        super(source, originService, destinationService);
        this.customField = customField;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }
}
