# Spring Plugin

## Overview

- Chooses algorithm dynamically at runtime as supposed to select at design time
- Use case SendingNotification : Email,SMS,PushNotification ConvertToFormat : CSV,TXT,XML,JSON
- Implemented libs : SpringFox

## Dependencies

`````````````````
        <dependency>
            <groupId>org.springframework.plugin</groupId>
            <artifactId>spring-plugin-core</artifactId>
            <version>2.0.0.RELEASE</version>
        </dependency>
        
         <dependency>
            <groupId>org.springframework.plugin</groupId>
            <artifactId>spring-plugin-metadata</artifactId>
            <version>1.2.0.RELEASE</version>
        </dependency>

`````````````````

## Components
``````````````````
 @EnablePluginRegistries
 Plugin<S>
 PluginRegistry<S,S>
 SimplePluginRegistry<T extends Plugin<S>, S>
 OrderAwarePluginRegistry<T extends Plugin<S>, S>
``````````````````