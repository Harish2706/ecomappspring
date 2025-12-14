package com.ecomapp.controller;

import com.ecomapp.model.Product;
import com.ecomapp.service.Productservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Productcontroller {
    private final Productservice service;
    public Productcontroller(Productservice service) {
        this.service = service;
    }



    @RequestMapping("/")
    public String greet(){
        return "Hello";
    }
    @GetMapping("/products")
    public List<Product> getallproducts(){
      return service.getallproducts();
    }

}
