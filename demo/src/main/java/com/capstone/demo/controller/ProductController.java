package com.capstone.demo.controller;

import com.capstone.demo.model.Product;
import com.capstone.demo.service.ProductService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    @CrossOrigin(origins = "http://localhost:4200")
    public @NotNull Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
