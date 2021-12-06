package com.example.pizza.repository;

import com.example.pizza.entity.Customer;
import com.example.pizza.entity.Purchases;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderInterfaceTest {



    @Autowired
    private OrderInterface orderInterface;

    @Test
    public void addOrders(){



        Purchases purchases =
                Purchases.builder()
                        .name("Tom")
                        .secondName("KONG")
                        .address("Jantarowa 67")
                        .orderPrice(100)
                        .apartment("12")
                        .city("Gdynia")
                        .phoneNumber("8821221")
                        .pizzaName("1"+ " | " + "10" + " | " + "3")
                        .build();

        System.out. println(purchases);
        orderInterface.save(purchases);
    }
}