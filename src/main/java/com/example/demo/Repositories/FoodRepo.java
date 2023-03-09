package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.FoodDelivery;

public interface FoodRepo extends JpaRepository<FoodDelivery, Integer> {

}
