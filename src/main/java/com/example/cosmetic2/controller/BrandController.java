package com.example.cosmetic2.controller;

import com.example.cosmetic2.model.Brand;
import com.example.cosmetic2.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    BrandService brandService;

    @GetMapping("/brand")
    public List<Brand> getAllBrand(){
        return brandService.getAllBrand();
    }
}
