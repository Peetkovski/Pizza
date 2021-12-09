package com.example.pizza.entity;


import lombok.*;
import org.hibernate.annotations.ColumnDefault;

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
    @Column(name="status", columnDefinition="String(0) default '0'")
    private  String status = "0";



}
