package com.example.Client2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Client2.entities.Client;
import com.example.Client2.repositories.ClientRepository;

@SpringBootApplication
public class Client2Application {

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}
	
	@Bean
	CommandLineRunner initializeMySQLDatabase(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"),"Amine SAFI", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"),"Amal ALAOUI", Float.parseFloat("22")));
			clientRepository.save(new Client(Long.parseLong("3"),"Samir RAMI", Float.parseFloat("22")));
		};
	}

}
