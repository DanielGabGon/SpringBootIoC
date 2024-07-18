package com.gabito.SpringBootIoC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.gabito.SpringBootIoC.repository.ProductRepository;

//@Component
@Service
public class ProductService {
	
	@Autowired
//	@Qualifier("productMySQLRepository") 
	private ProductRepository productRepository;
	
	
	
	
	public ProductService() {
		System.out.println("Creando instancia de "+ this.getClass().getSimpleName());
	}


	public void save(String name) {
		System.out.println("== SAVE "+ this.getClass().getSimpleName()+ "==");
		System.out.println("Producto guardado exitosamente :"+name );
		productRepository.save(name);
	}

	
	public void remove(String name) {
		System.out.println("== REMOVE "+ this.getClass().getSimpleName()+ "==");
		System.out.println("Producto eliminado exitosamente :"+name );
		productRepository.remove(name);
	}
	
}
