package com.ecomapp.service;

import com.ecomapp.model.Product;
import com.ecomapp.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Service
public class Productservice {
    @Autowired
    private Productrepo repo;
    public List<Product> getallproducts() {
        List<Product> list = repo.findAll();
        return list;
    }

    public Product getproductbyid(int id) {
        return repo.findById(id).orElse(null);
    }


    public Product addproduct(Product product, MultipartFile imagefile) throws IOException {
        product.setImagename(imagefile.getOriginalFilename());
        product.setImagetype(imagefile.getContentType());
        product.setImagedata(imagefile.getBytes());
        return repo.save(product);
    }
}
