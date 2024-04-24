package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.durgaprasadProduct;
import com.example.day6cw3.repository.durgaprasadProductRepo;

@Service
public class durgaprasadProductService {
    public durgaprasadProductRepo productRepo;
    public durgaprasadProductService(durgaprasadProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(durgaprasadProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<durgaprasadProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<durgaprasadProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public durgaprasadProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
