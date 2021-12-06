package com.example.pizza.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@Builder
@NoArgsConstructor
@Table(name = "Size")
@AllArgsConstructor
public class Size extends ArrayList<com.example.pizza.entity.Size> {

    @javax.persistence.Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private int Id;
    private String Size;



}
