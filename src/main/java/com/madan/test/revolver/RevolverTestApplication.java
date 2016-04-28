package com.madan.test.revolver;

import io.dropwizard.Application;
import io.dropwizard.revolver.RevolverBundle;
import io.dropwizard.revolver.core.config.RevolverConfig;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class RevolverTestApplication extends Application<RevolverTestConfiguration>{

    public static void main(String[] args) throws Exception {
        RevolverTestApplication revolverTestApplication = new RevolverTestApplication();
        revolverTestApplication.run(args);
    }

    @Override
    public void initialize(Bootstrap<RevolverTestConfiguration> bootstrap) {
        bootstrap.addBundle(new RevolverBundle<RevolverTestConfiguration>() {
            @Override
            public RevolverConfig getRevolverConfig(RevolverTestConfiguration apiConfiguration) {
                return apiConfiguration.getRevolverConfig();
            }
       });
    }

    @Override
    public void run(RevolverTestConfiguration revolverTestConfiguration, Environment environment) throws Exception {

    }
}
