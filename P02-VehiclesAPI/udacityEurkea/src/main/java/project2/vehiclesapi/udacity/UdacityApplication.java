package project2.vehiclesapi.udacity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UdacityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdacityApplication.class, args);
	}

}
