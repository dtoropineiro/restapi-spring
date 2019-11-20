package com.example.demo.consume;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Numero {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("numeroFin")
	private Integer numeroFin;
	@JsonProperty("numeroIncio")
	private Integer numeroIncio;
	@JsonProperty("numeros")
	private Integer numeros[];
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public Numero() {
		super();
	}
	
	public Numero(Integer id, Integer numeroFin, Integer numeroIncio, Integer[] numeros) {
		super();
		this.id = id;
		this.numeroFin = numeroFin;
		this.numeroIncio = numeroIncio;
		this.numeros = numeros;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroFin() {
		return numeroFin;
	}
	public void setNumeroFin(Integer numeroFin) {
		this.numeroFin = numeroFin;
	}
	public Integer getNumeroIncio() {
		return numeroIncio;
	}
	public void setNumeroIncio(Integer numeroIncio) {
		this.numeroIncio = numeroIncio;
	}
	public Integer[] getNumeros() {
		return numeros;
	}
	public void setNumeros(Integer[] numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "Numero [id=" + id + ", numeroFin=" + numeroFin + ", numeroIncio=" + numeroIncio + ", numeros="
				+ Arrays.toString(numeros) + "]";
	}
	
	
	
}
