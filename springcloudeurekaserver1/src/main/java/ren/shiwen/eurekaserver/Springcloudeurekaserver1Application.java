package ren.shiwen.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloudeurekaserver1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springcloudeurekaserver1Application.class, args);
	}
}
