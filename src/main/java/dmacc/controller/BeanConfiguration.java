package dmacc.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Pet;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Pet pet() {
		Pet bean = new Pet("Arroyo");
		bean.setOwner("Leslie D");
		return bean;
	}
	
}
