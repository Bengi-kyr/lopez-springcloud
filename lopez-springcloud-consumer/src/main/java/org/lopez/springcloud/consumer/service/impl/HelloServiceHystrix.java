package org.lopez.springcloud.consumer.service.impl;

import org.lopez.springcloud.consumer.service.IHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloServiceHystrix implements IHelloService {
	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello" + name + ", this messge send failed ";
	}
}
