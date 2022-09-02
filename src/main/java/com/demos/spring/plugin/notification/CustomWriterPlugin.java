package com.demos.spring.plugin.notification;

import org.springframework.plugin.core.Plugin;

public sealed interface CustomWriterPlugin extends Plugin<String>
        permits CustomTextWriter, CustomXmlWriter, CustomJsonWriter
{
    void write(String message);
}
