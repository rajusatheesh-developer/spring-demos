package com.demos.spring.plugin.notification;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public enum CustomWriterType {
    TEXT_WRITER("text"),
    XML_WRITER("xml"),
    JSON_WRITER("json"),
    HTML_WRITER("html");

    private final String name;

    CustomWriterType(String name) {
        this.name = name;
    }

    public static String getTypeName(String name) {
        return EnumSet.allOf(CustomWriterType.class)
                .stream()
                .filter(d -> d.name.equals(name))
                .findFirst()
                .map(d -> d.name)
                .orElse(null);
    }

    public static List<String> getAllTypes() {
        return EnumSet.allOf(CustomWriterType.class).stream()
                .map(d -> d.name).toList();
    }
}
