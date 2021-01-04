package com.sderver.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {PropertiesConfig.ReceiverConfig.class})
public class PropertiesConfig {

    @Getter
    @Setter
    @FieldDefaults(level = AccessLevel.PRIVATE)
    @ConfigurationProperties("services.receiver")
    public static class ReceiverConfig {
        String name;
        String port;
    }

}
