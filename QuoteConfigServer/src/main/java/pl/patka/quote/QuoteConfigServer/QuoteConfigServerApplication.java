package pl.patka.quote.QuoteConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class QuoteConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteConfigServerApplication.class, args);
	}

}
