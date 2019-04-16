package org.lopez.springcloud.consumer.service;

import org.lopez.springcloud.consumer.service.impl.GreetingServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider02", fallback = GreetingServiceHystrix.class)
public interface IGreetingService {
    @RequestMapping(value = "/greeting/{name}")
    public String greeting(@PathVariable String name);
}