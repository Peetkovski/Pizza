package com.example.pizza.repository;

import com.example.pizza.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PizzaInterface extends JpaRepository<Pizza, Long> {

    @Query("SELECT a.Name FROM Pizza a")
    List<String> findPizza();

    @Query("SELECT a.Price FROM Pizza a")
    List<String> findPrice();




}
