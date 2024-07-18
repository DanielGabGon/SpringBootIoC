package com.gabito.SpringBootIoC.repository;

public class ProductRepository {
	
	
	
	public ProductRepository() {
	     System.out.println("Creando instancia de "+ this.getClass().getSimpleName());
	}


	public void save(String name) {
		System.out.println("Producto guardado exitosamente :"+name );
	}
	
	
	public void remove(String name) {
		System.out.println("Producto eliminado exitosamente :"+name );
	}

}
