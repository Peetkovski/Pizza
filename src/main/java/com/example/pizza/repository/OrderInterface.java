package com.example.pizza.repository;

import com.example.pizza.entity.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInterface extends JpaRepository<Purchases,Long> {

    Purchases findByOrderId(Integer Id);

}
