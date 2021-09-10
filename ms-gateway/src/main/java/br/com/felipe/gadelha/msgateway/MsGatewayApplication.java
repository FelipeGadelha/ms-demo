package br.com.felipe.gadelha.msgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class MsGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("MS-USER", r -> r.path("/users/**")
						.uri("lb://MS-USER"))
				.route("MS-DEPARTMENT", r -> r.host("/departments/**")
						.uri("lb://MS-DEPARTMENT"))
				.build();
	}

}
