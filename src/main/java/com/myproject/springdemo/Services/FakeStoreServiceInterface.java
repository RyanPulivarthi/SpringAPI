package com.myproject.springdemo.Services;

import com.myproject.springdemo.Model.Product;

public interface FakeStoreServiceInterface {
    Product getProductById(Long id);
}
