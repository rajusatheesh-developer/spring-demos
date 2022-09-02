package com.demos.spring.plugin;

import com.demos.spring.plugin.notification.CustomWriterPlugin;
import com.demos.spring.plugin.notification.CustomWriterType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.PluginRegistry;
import org.springframework.plugin.core.SimplePluginRegistry;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@EnablePluginRegistries(CustomWriterPlugin.class)
public class SpringPluginDemoApplication implements ApplicationRunner {


    private final SimplePluginRegistry<CustomWriterPlugin, String> pluginRegistry;

    public SpringPluginDemoApplication(SimplePluginRegistry<CustomWriterPlugin, String> pluginRegistry) {
        this.pluginRegistry = pluginRegistry;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringPluginDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (var type : CustomWriterType.getAllTypes()) {
            var writer = pluginRegistry.getPluginFor(type).orElse(null);
            if (writer == null) {
                System.out.printf("No plugin found for %s%n", type);
                continue;
            }
            writer.write("Hello");
        }
    }
}
