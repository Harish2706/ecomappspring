package com.ecomapp.controller;

import com.ecomapp.model.Product;
import com.ecomapp.service.Productservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
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
    public ResponseEntity<List<Product>> getallproducts(){

      return new ResponseEntity<>(service.getallproducts(), HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product>ids(@PathVariable int  id){
         Product product = service.getproductbyid(id);
        if(product!=null)return new ResponseEntity<>(product,HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}
