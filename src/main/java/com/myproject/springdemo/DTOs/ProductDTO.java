package com.myproject.springdemo.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String name;
    private String desc;
    private String imgUrl;
    private Double price;
}
