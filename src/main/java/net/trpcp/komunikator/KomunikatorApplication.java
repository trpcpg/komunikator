package net.trpcp.komunikator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class KomunikatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KomunikatorApplication.class, args);
	}

}
