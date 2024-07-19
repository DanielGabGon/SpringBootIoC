package com.gabito.SpringBootIoC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabito.SpringBootIoC.service.ProductService;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication{


    @Autowired
	private ProductService  productService;
	
	

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
	

}
