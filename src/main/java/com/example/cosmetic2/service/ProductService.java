package com.example.cosmetic2.service;

import com.example.cosmetic2.model.Product;
import com.example.cosmetic2.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    PhotoService photoService;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }

    public Product addProduct(Product newProduct){
//        newProduct.setProductId(newProduct.getProductId());
//        newProduct.setProductName(newProduct.getProductName());
        return productRepository.save(newProduct);
    }

    public Product editProduct(Product newProduct, String id){
        return productRepository.findById(id).map(product -> {
            product.setProductName(newProduct.getProductName());
            product.setProductImage(newProduct.getProductImage());
            product.setPrice(newProduct.getPrice());
            product.setColors(newProduct.getColors());
            product.setBrandId(newProduct.getBrandId());
            product.setDescription(newProduct.getDescription());
            product.setLaunchDate(newProduct.getLaunchDate());
            return productRepository.save(product);
        }).orElse(null);
    }

    public Product addProductWithPicture(MultipartFile file, Product newProduct) throws IOException {
        newProduct.setProductImage(photoService.imageUpload(file));
        return  newProduct;
    }
}
