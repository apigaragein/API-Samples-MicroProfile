package com.apigaragein.quarkussamples.lifecycle;


import io.quarkus.runtime.Startup;
import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class ABean {
    private final String name;

    public ABean() {
        this.name = "some name";
    }
}
