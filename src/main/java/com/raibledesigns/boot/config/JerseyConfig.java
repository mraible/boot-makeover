package com.raibledesigns.boot.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/v1.0")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("com.raibledesigns.boot.service");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.JSON_PROCESSING_FEATURE_DISABLE, false);
        property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
        property(ServerProperties.WADL_FEATURE_DISABLE, true);
        register(LoggingFilter.class);
        register(JacksonFeature.class);
    }
}