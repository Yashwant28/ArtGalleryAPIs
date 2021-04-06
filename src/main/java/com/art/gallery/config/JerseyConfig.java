package com.art.gallery.config;

import com.art.gallery.resources.HealthCheckResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HealthCheckResource.class);
    }
}