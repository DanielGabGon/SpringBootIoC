package com.gabito.SpringBootIoC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.gabito.SpringBootIoC.service.ProductService;

@SpringBootApplication
public class SpringBootIoCApplication{



	private ProductService  productService;
	
	

	public SpringBootIoCApplication(ProductService  productService) {
	        this.productService=productService;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner comandoutilizadoAutowired() {
		return (args)->{ 
			System.out.println("PRODUCT SERVICE");
			productService.save("Teclado RGB");
			productService.remove("Auriculares básicos");
			
	
		};
	}
	
	

}
