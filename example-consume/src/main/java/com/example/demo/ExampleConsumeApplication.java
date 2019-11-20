package com.example.demo;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.consume.Numero;

@SpringBootApplication
public class ExampleConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleConsumeApplication.class, args);
	}

	
	@Bean
	public RestTemplate beanRestTemplate() {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Numero> num =restTemplate.getForEntity("http://localhost:8080/numeros/api", Numero.class);
		
		System.out.println("Número Fin: " + num.getBody().getNumeroFin());
	    return new RestTemplate();
	}
}
