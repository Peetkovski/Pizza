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
                        .name("Kacper ")
                        .secondName("jajxczv")
                        .address("czerowna 54")
                        .orderPrice(69)
                        .apartment("100")
                        .city("Gdynia")
                        .phoneNumber("123456789")
                        .status("0")
                        .build();

        System.out. println(purchases);
        orderInterface.save(purchases);
    }



    @Test
    public void findById(){



    }
}
