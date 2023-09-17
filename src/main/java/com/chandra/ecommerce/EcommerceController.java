package com.chandra.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
