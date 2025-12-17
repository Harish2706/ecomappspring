package com.ecomapp.service;

import com.ecomapp.model.Product;
import com.ecomapp.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Productservice {
    @Autowired
    private Productrepo repo;
    public List<Product> getallproducts() {
        List<Product> list = repo.findAll();
        list.forEach(System.out::println);
        return list;
    }

    public Product getproductbyid(int id) {
        return repo.findById(id).get();
    }
}
