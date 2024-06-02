package com.myproject.springdemo.Services;

import com.myproject.springdemo.DTOs.FakeStoreDTO;
import com.myproject.springdemo.Model.Category;
import com.myproject.springdemo.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreApiService implements FakeStoreServiceInterface{
    //FakeStoreServiceInterface fakeStoreServiceInterface=new FakeStoreApiService();

    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    @Override
    public Product getProductById(Long productId){
        RestTemplate restTemplate=restTemplateBuilder.build();
        FakeStoreDTO fakeStoreDTO=restTemplate.getForEntity("https://fakestoreapi.com/products/1", FakeStoreDTO.class,productId).getBody();
        return convertToProduct(fakeStoreDTO);
    }
    public Product convertToProduct(FakeStoreDTO fakeStoreDTO){
        Product product=new Product();
        product.setId(fakeStoreDTO.getId());
        product.setName(fakeStoreDTO.getTitle());
        product.setPrice(fakeStoreDTO.getPrice());
        product.setImgUrl(fakeStoreDTO.getImage());
        Category category=new Category();
        category.setName(fakeStoreDTO.getCategory());
        product.setCategory(category);
        product.setDesc(fakeStoreDTO.getDescription());
        return product;
    }
}
