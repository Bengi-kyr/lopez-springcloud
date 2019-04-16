package org.lopez.springcloud.consumer.controller;

import org.lopez.springcloud.consumer.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingServiceController {
    @Autowired
    private IGreetingService greetingService;

    @RequestMapping("/greeting/{name}")
    public String greeting(@PathVariable("name") String name) {
        return greetingService.greeting(name);
    }
}
