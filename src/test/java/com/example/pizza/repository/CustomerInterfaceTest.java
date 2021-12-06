package com.example.pizza.repository;

import com.example.pizza.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerInterfaceTest {


    @Autowired
    private CustomerInterface customerInterface;



    @Test
    public void saveCustomer(){

        Customer customer =
                Customer.builder()
                        .Name("Piotr")
                        .SecondName("Gapinski")
                        .Address("Jantarowa 69")
                        .Apartment("12")
                        .City("Gdynia")
                        .Email("peetkovski@gmail.com")
                        .PostCode("81-187")
                        .Description("Brama numer 2")
                        .build();

        customerInterface.save(customer);
    }

    @Test
    public void findByEmail(){




    }


}