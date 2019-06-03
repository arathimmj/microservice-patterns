package com.stackroute.SpringBoot_Restful_Service;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootRestfulServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(SpringBootRestfulServiceApplication.class, args);
	}

}



