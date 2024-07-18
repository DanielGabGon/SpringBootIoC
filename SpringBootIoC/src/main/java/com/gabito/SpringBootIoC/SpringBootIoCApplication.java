package com.gabito.SpringBootIoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gabito.SpringBootIoC.repository.ProductRepository;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola spring con la interfaz CommandLineRunner");
	}
	
	@Bean
	public CommandLineRunner comandoGenerico() {//Implementación del CommandLineRunner Testeo
		return (args)->{
			System.out.println("Hola spring con la interfaz CommandLineRunner implementado "
					+ "como expresión Lamda");
		};
	}
	
	
	@Bean
	public CommandLineRunner comandoutilizadoAutowired() {
		return (args)->{
			productRepository.save("Control Remoto");
			productRepository.remove("Mouse USB Generico");
		};
	}
	
	

}
