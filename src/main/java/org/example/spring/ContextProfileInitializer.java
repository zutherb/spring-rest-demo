package org.example.spring;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.util.StringUtils;
import org.springframework.web.context.ConfigurableWebApplicationContext;

import java.util.logging.Logger;

/**
 * @zutherb
 */
public class ContextProfileInitializer implements ApplicationContextInitializer<ConfigurableWebApplicationContext> {

    @Override
    public void initialize(ConfigurableWebApplicationContext configurableWebApplicationContext) {
        ConfigurableEnvironment environment = configurableWebApplicationContext.getEnvironment();
        if(hasActiveProfile(environment)){
           environment.setActiveProfiles("deployment");
        }
    }

    private boolean hasActiveProfile(ConfigurableEnvironment environment) {
        return environment.getActiveProfiles().length == 0;
    }
}
