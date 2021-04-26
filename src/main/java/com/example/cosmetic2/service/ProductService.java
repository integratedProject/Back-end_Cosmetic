package com.example.cosmetic2.service;

import com.example.cosmetic2.model.Product;
import com.example.cosmetic2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }

}
