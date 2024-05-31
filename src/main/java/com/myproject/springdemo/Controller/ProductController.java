package com.myproject.springdemo.Controller;

import com.myproject.springdemo.Model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/products/{ryan}")
    public Product getProduct(@PathVariable("ryan") Long id){
        Product product=new Product();
        product.setId(id);
        product.setName("Iphone");
        product.setDesc("This is the costliest product");
        product.setPrice(190000.95);
        return product;

    }
}
