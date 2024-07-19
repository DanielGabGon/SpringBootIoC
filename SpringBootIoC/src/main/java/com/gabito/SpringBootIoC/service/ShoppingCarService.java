package com.gabito.SpringBootIoC.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
//@Scope("singleton")  es parecido al ApplicationScope, crea una instancia y es la misma para toda la aplicación
//@SessionScope    //Se crea una instancia por cada solicitud de la instancia.
//@RequestScope     // Se crea una instancia pero inmediatamente después se destruye por que es de petición.
//@ApplicationScope  //Se crea una instancia y es la misma para toda la aplicación
public class ShoppingCarService {
	
	
	private List<String> products = new ArrayList<>();
	
	private Integer counter=0;
	
	
	public void add() {
		counter++;
		products.add(counter.toString()+ "-Microfono");
	}
	
	public List<String> get(){
		return products;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("=======> Creando instancia de "+this.getClass().getSimpleName());
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("=========> Destruyendo instancia de "+ this.getClass().getSimpleName());
	}
	
	
}
