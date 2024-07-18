package com.gabito.SpringBootIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gabito.SpringBootIoC.repository.ProductRepository;



@Configuration
public class BeansInjector {
	
	@Bean
	public ProductRepository createProductRepository() {
		return new ProductRepository() ;
	}

}
