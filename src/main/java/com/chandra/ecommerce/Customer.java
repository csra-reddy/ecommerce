package com.chandra.ecommerce;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String address;
    private String sex;
    private int birthDate;


    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name="Customer_Order_Id",nullable = true)
    //@JsonIgnore
    private Product product;

}
