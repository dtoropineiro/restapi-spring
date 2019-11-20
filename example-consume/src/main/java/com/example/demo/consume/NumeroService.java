package com.example.demo.consume;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NumeroService {

	@Autowired
    private RestTemplate restTemplate;
	
	@Value("${resource.numeros}")
	private String resource;
	@Value("${resource.numeros}/{id}")
	private String idResource;
	
	public List<Numero> findAll() {
	    return Arrays.stream(restTemplate.getForObject(resource, Numero[].class)).collect(Collectors.toList());
	}
}
