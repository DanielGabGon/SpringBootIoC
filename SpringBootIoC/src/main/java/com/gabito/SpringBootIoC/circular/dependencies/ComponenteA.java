package com.gabito.SpringBootIoC.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponenteA {
	
	@Autowired
	private ComponenteB componenteB; 

}
