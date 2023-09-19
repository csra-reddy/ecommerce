package com.chandra.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    @Autowired
    private EcommerceRepositoryCust ecommerceRepositoryCust;

    public Product createProduct(Product product) {
        return ecommerceRepository.save(product);
    }

    public Product createProduct1(Product product) {
        return ecommerceRepository.save(product);
    }

    public Customer createCustomer(Customer customer) {
        return ecommerceRepositoryCust.save(customer);
    }

    public List<Customer> getCustomer() {
        return ecommerceRepositoryCust.findAll();
    }
}
