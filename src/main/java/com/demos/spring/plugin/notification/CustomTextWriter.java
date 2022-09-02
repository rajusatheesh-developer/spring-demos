package com.demos.spring.plugin.notification;

import org.springframework.stereotype.Component;

@Component
public final class CustomTextWriter implements CustomWriterPlugin
{

    @Override
    public void write(String message) {
        System.out.println("Text: "+message);
    }

    @Override
    public boolean supports(String s) {
        String type=CustomWriterType.TEXT_WRITER.getType();
        return s.equalsIgnoreCase(type);

    }
}
