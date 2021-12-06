package com.example.pizza.repository;

import com.example.pizza.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeInterface extends JpaRepository<Size, Long> {
}
