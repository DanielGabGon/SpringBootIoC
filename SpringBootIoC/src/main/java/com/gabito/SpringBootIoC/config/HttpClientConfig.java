package com.gabito.SpringBootIoC.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.gabito.SpringBootIoC.repository.ProductRepository;

@Configuration
public class HttpClientConfig {
	

	    @Bean
	    public RestTemplate restTemplate(ProductRepository productRepository) {
		     System.out.println("CREANDO BEAN DE UN REST TEMPLATE");
		    productRepository.save("T-SHIRT");
	    	return  new RestTemplate(); 
	    }

}
