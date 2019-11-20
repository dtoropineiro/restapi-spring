package com.example.demo.consume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = "/")
public class NumeroController {
	
	@Autowired
	private NumeroService numeroService;
	
	@Test
	public void consume() {
		
		RestTemplate restTemplate = new RestTemplate();
		Numero num =restTemplate.getForObject("http://localhost:8080/numeros/api", Numero.class);
	}
	
	@GetMapping("/numeros")
	public String findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Numero> numeroList = new ArrayList<Numero>();
		Numero numero = restTemplate.getForObject("http://localhost:8080/numeros/api", Numero.class);
		
		numeroList.add(numero);
		ResponseEntity<Numero> num =restTemplate.getForEntity("http://localhost:8080/numeros/api", Numero.class);
		System.out.println("Lista números: " + numeroList.get(0).toString());
		System.out.println("Número Fin: " + num.getBody().getNumeroFin());
	    return numeroList.toString();
	}
	@RequestMapping(value = "/{id}")
    public List<Numero> findAll(@PathVariable("id") Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Numero> num =restTemplate.getForEntity("http://localhost:8080/numeros/api", Numero.class);
		
		System.out.println("Número Fin: " + num.getBody().getNumeroFin());
        return null;
    }

}
