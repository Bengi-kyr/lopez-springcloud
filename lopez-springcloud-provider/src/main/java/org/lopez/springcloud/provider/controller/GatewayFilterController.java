package org.lopez.springcloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayFilterController {

	@RequestMapping("/foo")
	public String foo(String foo) {
		return "hello " + foo + "!";
	}
}
