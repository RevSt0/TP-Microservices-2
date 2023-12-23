package com.example.Voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Voiture.models.CarResponse;
import com.example.Voiture.services.CarService;

@RestController
@RequestMapping("api/car")
public class CarController {
	@Autowired
	private CarService carService;
	
	@GetMapping
	public List<CarResponse> findAll(){
		return carService.findAll();
	}
	
	@GetMapping("/{id}")
	public CarResponse findById(@PathVariable Long id) throws Exception{
		return carService.findById(id);
	}
	
}
