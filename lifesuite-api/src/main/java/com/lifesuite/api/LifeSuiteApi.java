package com.lifesuite.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The LifeSuite API is a backend microservice which provides
 * services to the LifeSuite frontend service.
 * 
 * Any dependencies included that contain spring related objects
 * under the com.lifesuite package will be accessable from this application.
 * 
 * This means it's very simple to create services, controllers, etc, in separate jars,
 * and then use spring magic to import them and have them appear in a swagger page here.
 * 
 * @author sean
 *
 */
@SpringBootApplication(scanBasePackages = "com.lifesuite.api")
public class LifeSuiteApi 
{
    public static void main( String[] args )
    {
        SpringApplication.run(LifeSuiteApi.class, args);
    }
}
