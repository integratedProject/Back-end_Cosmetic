package com.example.cosmetic2.controller;

import com.example.cosmetic2.model.Product;
import com.example.cosmetic2.service.ProductColorService;
import com.example.cosmetic2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ProductColorService productColorService;

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id){
        productColorService.deleteProductColorByProductId(id);
//        productService.deleteProduct(id);
//        productService.deleteProduct(id);
    }

//    @GetMapping("/product/{id}")
//    public Optional<Product> findById(@PathVariable String id){
//        return productService.findById(id);
//    }
}
