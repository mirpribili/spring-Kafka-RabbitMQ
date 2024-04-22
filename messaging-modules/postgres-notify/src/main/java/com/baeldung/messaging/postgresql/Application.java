package com.baeldung.messaging.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        // /home/user/.jdks/jbr-17.0.9/bin/java /home/user/[works]/IdeaProjects/spring-Kafka-RabbitMQ/messaging-modules/postgres-notify/target/postgres-notify-0.0.1-SNAPSHOT.jar -Dserver.port=8081
    }
}