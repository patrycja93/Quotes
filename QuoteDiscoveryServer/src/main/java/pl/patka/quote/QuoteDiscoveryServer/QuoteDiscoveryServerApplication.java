package pl.patka.quote.QuoteDiscoveryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class QuoteDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteDiscoveryServerApplication.class, args);
	}

}
