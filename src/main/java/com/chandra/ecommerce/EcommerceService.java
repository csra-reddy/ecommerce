package com.chandra.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    public Product createProduct(Product product) {
        return ecommerceRepository.save(product);
    }
}
