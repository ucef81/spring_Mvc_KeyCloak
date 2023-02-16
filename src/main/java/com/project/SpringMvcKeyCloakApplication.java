package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.entity.Product;
import com.project.repository.ProductRepository;

import com.project.repository.ProductRepository;

@SpringBootApplication
public class SpringMvcKeyCloakApplication {
	
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcKeyCloakApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner start() {
		return args -> {
			productRepository.save(new Product(null, "HP 456", 2500.00));
			productRepository.save(new Product(null, "Dell XPS 13", 6900.00));
			productRepository.save(new Product(null, "Lenovo X1 Carbon", 5400.00));
			productRepository.save(new Product(null, "Asus VivoBook", 4500.00));
			productRepository.save(new Product(null, "Acer 800X", 3200.00));
		};
	}
	 

}
