package com.demos.spring.plugin.notification;

import java.util.EnumSet;
import java.util.List;

public enum CustomWriterType {
    TEXT_WRITER("text"),
    XML_WRITER("xml"),
    JSON_WRITER("json"),
    HTML_WRITER("html");

    private final String type;

    CustomWriterType(String type) {
        this.type = type;
    }

    public static List<String> getAllTypes() {
        return EnumSet.allOf(CustomWriterType.class).stream()
                .map(d -> d.type).toList();
    }

    public String getType() {
        return type;
    }
}
