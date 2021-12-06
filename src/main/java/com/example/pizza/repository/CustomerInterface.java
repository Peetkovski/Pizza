package com.example.pizza.repository;

import com.example.pizza.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerInterface extends JpaRepository<Customer, Long> {


}
