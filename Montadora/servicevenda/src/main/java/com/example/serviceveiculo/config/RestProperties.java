package com.example.serviceveiculo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "remote.service")
public class RestProperties {

    private String baseUrl = "";
    private String path = "";
}
