package org.lopez.springcloud.consumer.service;

import org.lopez.springcloud.consumer.service.impl.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider01", fallback = HelloServiceHystrix.class)
public interface IHelloService {
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name") String name);
}
