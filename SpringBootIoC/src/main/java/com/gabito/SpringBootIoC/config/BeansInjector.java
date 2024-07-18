package com.gabito.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gabito.SpringBootIoC.repository.ProductRepositoryA;
import com.gabito.SpringBootIoC.repository.ProductRepositoryB;
import com.gabito.SpringBootIoC.service.ProductService;



@Configuration
public class BeansInjector {
	
	@Bean
	public ProductRepositoryA createProductRepositoryA() {
		return new ProductRepositoryA() ;
	}
	
	@Bean
	public ProductRepositoryB createProductRepositoryB() {
		return new ProductRepositoryB();
	}
	
	@Bean
	public ProductService createProductService() {
		return new ProductService();
	}

}
