package com.example.pizza.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Customer {


    @javax.persistence.Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long Id;
    private String Name;
    private String SecondName;
    private String phoneNumber;
    private String Email;
    private String Address;
    private String Apartment;
    private String City;
    private String PostCode;
    private String Description;

}
