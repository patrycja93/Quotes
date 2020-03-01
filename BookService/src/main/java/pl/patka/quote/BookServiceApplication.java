package pl.patka.quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.SpringProperties;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties
public class BookServiceApplication {

	public static void main(String[] args) {
	  SpringApplication.run(BookServiceApplication.class, args);
	}
}