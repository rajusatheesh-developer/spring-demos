package com.demos.spring.plugin.notification;

import org.springframework.stereotype.Component;

@Component
public  final class CustomXmlWriterPlugin implements CustomWriterPlugin {
    @Override
    public void write(String message) {
        System.out.println("XML: "+message);

    }

    @Override
    public boolean supports(String s) {
        return s.equalsIgnoreCase(CustomWriterType.XML_WRITER.name());
    }
}
