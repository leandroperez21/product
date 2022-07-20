package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product getProducto(Long id) {
		return productRepository.findById(id).get();
	}
	
	public List<Product> getListaProductos(){
		return productRepository.findAll();
	}

}
