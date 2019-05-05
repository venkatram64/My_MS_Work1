package com.venkat.limits.limitsservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.venkat.limits.limitsservice.config.Configuration;
import com.venkat.limits.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }

    @GetMapping("/fault-tolerance-eg")
    @HystrixCommand(fallbackMethod = "fallbackRetrieveConfiguration")
    public LimitConfiguration retrieveConfiguration(){
        throw new RuntimeException("Not available");
    }

    public LimitConfiguration fallbackRetrieveConfiguration(){
        return new LimitConfiguration(-10,-200);
    }
}
