package com.example.pizza.repository;

import com.example.pizza.entity.Pizza;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PizzaInterfaceTest {

    @Autowired
    private PizzaInterface pizzaInterface;


    @Test
    public void findAllPizza(){

        List<String> pizza =
                pizzaInterface.findPizza();

        System.out.println(pizza);

    }


    @Test
    public void addPizza(){



        Pizza pizza =
                Pizza.builder()
                        .Name("Capriciosa")
                        .Price(50)
                        .build();

            pizzaInterface.save(pizza);

    }


}