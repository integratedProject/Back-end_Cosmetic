package com.example.cosmetic2.controller;

import com.example.cosmetic2.model.Product;
import com.example.cosmetic2.service.PhotoService;
import com.example.cosmetic2.service.ProductColorService;
import com.example.cosmetic2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    PhotoService photoService;

    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }

    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product newProduct){
        return productService.addProduct(newProduct);
    }

    @PutMapping("/product/edit/{id}")
    public Product editProduct(@RequestBody Product newProduct, @PathVariable String id) {
        return productService.editProduct(newProduct, id);
    }

    @PostMapping("/product/photo")
    public Product addProductWithPhoto(@RequestParam("file")MultipartFile file, @RequestPart Product product) throws IOException {
        return productService.addProductWithPicture(file, product);
    }

    @GetMapping("/product/photo/{file}")
    public ResponseEntity<byte[]> getPhoto(@PathVariable String file) throws IOException {
        return photoService.getPhoto(file);
    }

}
