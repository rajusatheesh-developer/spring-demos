package com.demos.spring.plugin.notification;

import org.springframework.stereotype.Component;

@Component
public final class CustomTextWriterPlugin implements CustomWriterPlugin
{

    @Override
    public void write(String message) {
        System.out.println("Text: "+message);
    }

    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase(CustomWriterType.TEXT_WRITER.name());

    }
}
