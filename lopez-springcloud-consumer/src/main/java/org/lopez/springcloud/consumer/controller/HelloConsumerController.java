package org.lopez.springcloud.consumer.controller;

import org.lopez.springcloud.consumer.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumerController {
	@Autowired
	private IHelloService helloService;

	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloService.hello(name);
	}
}
