package io.s3soft.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class S3foodDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3foodDiscoveryServerApplication.class, args);
	}

}
