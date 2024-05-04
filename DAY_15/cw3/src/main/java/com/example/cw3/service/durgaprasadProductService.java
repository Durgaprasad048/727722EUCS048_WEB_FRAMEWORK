package com.example.cw3.service;

import com.example.cw3.model.durgaprasadProduct;
import com.example.cw3.repository.durgaprasadProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgaprasadProductService {

    @Autowired
    private durgaprasadProductRepo productRepo;

    public List<durgaprasadProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public durgaprasadProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public durgaprasadProduct addProduct(durgaprasadProduct product) {
        return productRepo.save(product);
    }
}