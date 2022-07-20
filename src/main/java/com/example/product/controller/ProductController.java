package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product product(@PathVariable Long id) {
		return productService.getProducto(id);
	}
	
	@GetMapping("/list-products")
	public List<Product> verProductos(){
		return productService.getListaProductos();
	}

}
