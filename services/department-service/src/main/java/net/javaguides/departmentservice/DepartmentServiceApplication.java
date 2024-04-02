package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		// http://localhost:8080/swagger-ui/index.html
		info = @Info(
				title = "Department REST API Documentation",
				description = "Department REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "user",
						email = "user.net@gmail.com",
						url = "https://www.user.net"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.user.net/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Documentation",
				url = "https://www.user.net/user_management.html"
		)
)
@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
