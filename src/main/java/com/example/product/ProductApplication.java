package com.example.product;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@SpringBootApplication
@EnableFeignClients
public class ProductApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initDataPlayer(ProductRepository repository) {
		return (args) -> {
			// save a couple of players
			Product p1 = new Product("Aceite Alsamar", "Aceite Girasol Alsamar 1.5 lt");
			Product p2 = new Product("Favinco","Aceto Balsámico Espeso Favinco 250 cc");
			Product p3 = new Product("Agus Ser","Agua Mineral Sin Gas Bajo Sodio Ser 1.5 lt");
			
			repository.saveAll(Arrays.asList(p1,p2,p3));

		};
	}

}
