package com.example.pizza.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Pizza {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int Id;
    private int Price;
    private String Name;



}



