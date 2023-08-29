package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.skillstorm.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Integer>{
	
	

}
