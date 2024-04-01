package net.javaguides.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//I had the same problem when updating the spring-boot version to 3.0.0, I think it's some compatibility bug with spring cloud and spring boot's autoconfigure. I solved it by adding the annotation
@SpringBootApplication
@EnableFeignClients
@ImportAutoConfiguration({FeignAutoConfiguration.class})
//@EnableEurekaClient
public class EmployeeServiceApplication {

//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
