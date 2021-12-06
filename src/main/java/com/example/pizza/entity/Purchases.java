package com.example.pizza.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder

public class Purchases {


    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Integer orderId;
    private String name;
    private String secondName;
    private String phoneNumber;
    private String pizzaName;
    private Integer orderPrice;
    private String address;
    private String apartment;
    private String city;



}
