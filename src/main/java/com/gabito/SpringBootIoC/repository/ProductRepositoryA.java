package com.gabito.SpringBootIoC.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component("productMySQLRepository")
@Repository("productMySQLRepository")
@Primary
public class ProductRepositoryA implements ProductRepository{
	
	
	

	
	@PostConstruct
	public void postConstruct() {
		System.out.println("=======> Creando instancia de "+this.getClass().getSimpleName());
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("=========> Destruyendo instancia de "+ this.getClass().getSimpleName());
	}


	public void save(String name) {
		System.out.println("== SAVE "+ this.getClass().getSimpleName()+ "==");
		System.out.println("Producto guardado exitosamente :"+name );
	}
	
	
	public void remove(String name) {
		System.out.println("== REMOVE "+ this.getClass().getSimpleName()+ "==");
		System.out.println("Producto eliminado exitosamente :"+name );
	}

}
