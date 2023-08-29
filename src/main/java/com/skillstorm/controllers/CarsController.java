package com.skillstorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Cars;
import com.skillstorm.services.CarServiceImplementation;

@RestController
@RequestMapping("/cars")

public class CarsController {
      private CarServiceImplementation imp;
      
      @Autowired
      public CarsController(CarServiceImplementation imp) {
    	  this.imp = imp;
    	  
      }
      @GetMapping
      public List<Cars> getAllCars(){
    	  return imp.carsList();
      }
      @GetMapping("/{Id}")
      
      public Cars getCarById(@PathVariable int Id) {
    	  return imp.findById(Id);
      }
      @PostMapping()
     
      public void createCar(@RequestBody Cars cars) {
    	  
    	  imp.createCar(cars);
      }
      @PutMapping("/{Id}")
      public void updateCar(@RequestBody Cars cars, @PathVariable int Id) {
    	   imp.update(cars, Id);
    	  
      }
      @DeleteMapping("/{Id}")
      public void deleteCar(@PathVariable int Id) {
    	  imp.deletedCar(Id);
      }
}