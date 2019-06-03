package com.stackroute.gatewayproxyservice;

import com.stackroute.gatewayproxyservice.filters.ErrorFilter;
import com.stackroute.gatewayproxyservice.filters.PostFilter;
import com.stackroute.gatewayproxyservice.filters.PreFilter;
import com.stackroute.gatewayproxyservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class GatewayproxyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayproxyserviceApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
