package org.lopez.springcloud.consumer.service.impl;

import org.lopez.springcloud.consumer.service.IGreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceHystrix implements IGreetingService {
    @Override
    public String greeting(String name) {
        return "Are you OK? " + name + "FAILED.";
    }
}
