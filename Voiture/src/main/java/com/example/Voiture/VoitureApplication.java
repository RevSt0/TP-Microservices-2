package com.example.Voiture;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.example.Voiture.entities.Car;
import com.example.Voiture.repositories.CarRepository;

@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(5000);
		requestFactory.setReadTimeout(5000);
		restTemplate.setRequestFactory(requestFactory);
		return restTemplate;
	}
	
	@Bean
	CommandLineRunner initializeMySQLDatabase(CarRepository carRepository) {
		return args -> {
			carRepository.save(new Car(Long.parseLong("1"),"BMW","A1","ABC", Long.parseLong("1")));
			carRepository.save(new Car(Long.parseLong("2"),"Toyota","B2","DEF", Long.parseLong("1")));
			carRepository.save(new Car(Long.parseLong("3"),"Tesla","C3","GHI", Long.parseLong("1")));
		};
	}

}
