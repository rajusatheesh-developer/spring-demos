package com.demos.spring.plugin.notification;

import org.springframework.stereotype.Component;

@Component
public final class CustomJsonWriter implements CustomWriterPlugin {
    @Override
    public void write(String message) {
        System.out.println("JSON: " + message);

    }

    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase(CustomWriterType.JSON_WRITER.getType());

    }
}
