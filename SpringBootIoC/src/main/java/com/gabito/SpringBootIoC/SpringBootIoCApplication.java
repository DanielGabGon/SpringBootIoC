package com.gabito.SpringBootIoC;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabito.SpringBootIoC.service.ProductService;
import com.gabito.SpringBootIoC.service.ShoppingCarService;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication{


    @Autowired
	private ProductService  productService;
    
    @Autowired
    private ShoppingCarService shoppingCarService;
	
	

	public SpringBootIoCApplication() {

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}
	
	@RequestMapping("/example")
	public String example(){
		productService.save("Zapatos Nike");
		return "Hello Spring Boot IoC";
	}
	
	@RequestMapping("/add-products")
	public String addProduct(){
		shoppingCarService.add();
		return "Producto agregado";
	}
	
	@RequestMapping("/get-products")
	public List<String>  getProduct(){
		return shoppingCarService.get();
	}
	
	
	
	
	

}
