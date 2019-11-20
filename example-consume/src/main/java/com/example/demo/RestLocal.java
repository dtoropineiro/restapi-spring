package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.example.demo.consume.Numero;
public class RestLocal {

	private static final String URL_API ="http://localhost:8080/numeros/api";
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

        getAll(restTemplate);

	}
	
	private static void getAll(RestTemplate restTemplate) {
		List<Numero> numeroList;
        ResponseEntity<Numero[]> response = restTemplate.getForEntity(URL_API, Numero[].class);
	}

}
