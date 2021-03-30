package com.apigaragein.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/hello")
public class HelloResource {

    @ConfigProperty(name="greeting.message")
    String message;

    @ConfigProperty(name="greeting.suffix")
    String suffix;

    @ConfigProperty(name="greeting.name")
    Optional<String> name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return message + " " + name.orElse("World") + suffix;
    }
}