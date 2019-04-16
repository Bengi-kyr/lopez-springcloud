package org.lopez.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderApplication.class, args);
    }
}
