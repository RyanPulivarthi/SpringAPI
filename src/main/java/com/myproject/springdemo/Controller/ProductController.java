package com.myproject.springdemo.Controller;

import com.myproject.springdemo.Model.Product;
import com.myproject.springdemo.Services.FakeStoreApiService;
import com.myproject.springdemo.Services.FakeStoreServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    FakeStoreServiceInterface fakeStoreServiceInterface;
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id){
        return fakeStoreServiceInterface.getProductById(id);
        //return product;
    }
}
