package com.art.gallery.config;

import com.art.gallery.resource.HealthCheck;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class jerseyConfig extends ResourceConfig {

    public jerseyConfig() {
        register(HealthCheck.class);
    }
}
