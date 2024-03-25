# Event-Driven Microservices using Spring boot and Kafka or RabbitMq


### REST:
- CRUD,
- Spring Data JPA,
- PostgreSQL Database

### Microservices Communication:
- RestTemplate,
- WebClient,
- Spring Cloud OpenFeign
#### step by step
- RestTemplate (old way)
- dev steps:
- - add dpartmentCode field in Employee JPA Entity
- - create DepartmentDto class
- - configure RestTemplate as Spring Bean
- - Inject and use RestTemplate to make REST API call in EmployeeServiceImpl class
- WebClient steps
- - add spring WebFlux dependency
- - configure WebClient as bean
- - inject and use to call the REST API
- spring cloud OpenFeign steps
- - add spring cloud open feign Maven dependency
- - enable feign Client using @EnableFeignClients
- - Create Feign API Client
- - Change the getEmployeeById method to use APIClient

### Service Registry and Discovery:
- Spring Cloud Netflix Eureka

### Load balancing:
- Eureka server,
- Open Feign using Spring Cloud LoadBalancer

### API Gateway:
- Spring Cloud Gateway

### Centralized Configurations:
- Spring Cloud Config Server

### Auto Refresh Config Changes:
- Spring Cloud Bus

### Distributed Tracing:
- Spring Cloud Sleuth and Zipkin

### Resilience4J:
- Circuit Breaker, 
- Retry,
- RateLimiter Patterns

### Generate REST API Documentation
- Docker Compose for Dockering Spring Boot MySQL CRUD Application
- Event-Driven Microservices using Spring boot and Kafka or RabbitMq
