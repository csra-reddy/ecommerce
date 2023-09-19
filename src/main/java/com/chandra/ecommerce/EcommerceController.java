package com.chandra.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @PostMapping("/createproduct")
    public Product createProduct(@RequestBody Product product){
        ecommerceService.createProduct(product);
        return product;
    }

    @PostMapping("/createproduct1")
    public ResponseEntity<Product> createProduct1(@RequestBody Product product){
        Product response = ecommerceService.createProduct(product);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/createcustomer")
    public Customer createCustomer(@RequestBody Customer customer){
        ecommerceService.createCustomer(customer);
        return customer;
    }

    @GetMapping("/getcustomers")
    public List<Customer> getCustomer(){
        return ecommerceService.getCustomer();
    }


}
