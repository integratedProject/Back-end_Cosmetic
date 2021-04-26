package com.example.cosmetic2.controller;

import com.example.cosmetic2.model.ProductColor;
import com.example.cosmetic2.service.ProductColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductColorController {
    @Autowired
    ProductColorService productColorService;

    @GetMapping("/productcolor")
    public List<ProductColor> getAllProductColor(){
        return productColorService.getAllProductColor();
    }

    @DeleteMapping("/productcolor/{id}")
    public void deleteProductColor(@PathVariable String id){
        productColorService.deleteProductColor(id);
    }
}
