package com.example.Voiture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Voiture.entities.Car;

public interface CarRepository extends JpaRepository<Car,Long>{

}
