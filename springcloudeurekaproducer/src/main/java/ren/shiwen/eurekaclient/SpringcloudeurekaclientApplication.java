package ren.shiwen.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudeurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaclientApplication.class, args);
	}
}
