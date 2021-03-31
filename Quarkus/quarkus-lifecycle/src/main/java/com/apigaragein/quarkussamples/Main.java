package com.apigaragein.quarkussamples;

import com.apigaragein.quarkussamples.lifecycle.ABean;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String ... args){
        System.out.println("Running main method");
        Quarkus.run(QuarkusSampleApp.class,args);
    }
    public static class QuarkusSampleApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Do startup logic here");
            Quarkus.waitForExit();
            return 0;
        }
    }
}
