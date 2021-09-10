package br.com.felipe.gadelha.msdepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDepartmentApplication.class, args);
	}

}
