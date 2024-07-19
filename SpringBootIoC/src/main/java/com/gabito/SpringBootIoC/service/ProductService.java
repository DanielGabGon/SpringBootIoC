package com.gabito.SpringBootIoC.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gabito.SpringBootIoC.repository.ProductRepository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
@Service
//@SessionScope
//@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@ApplicationScope
//@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductService {

	private ProductRepository productRepository;
	
	@Value("${messages.success}")
	private String messages;
	
	
	public ProductService() {
		

		System.out.println("Creando instancia de "+ this.getClass().getSimpleName());
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("=======> Creando instancia de "+this.getClass().getSimpleName());
		System.out.println("=========> Mensaje desde application.properties :"+ messages);
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("=========> Destruyendo instancia de "+ this.getClass().getSimpleName());
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

	
    @Autowired
    @Qualifier("productXMLRepository")
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
}
