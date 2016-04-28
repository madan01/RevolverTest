package com.madan.test.revolver;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.revolver.core.config.RevolverConfig;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public class RevolverTestConfiguration extends Configuration {

    private RevolverConfig revolverConfig;

    @JsonProperty("revolver")
    public RevolverConfig getRevolverConfig() {
        return revolverConfig;
    }

    public void setRevolverConfig(RevolverConfig revolverConfig) {
        this.revolverConfig = revolverConfig;
    }


}
