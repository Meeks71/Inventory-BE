package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Cars;
import com.skillstorm.repositories.CarsRepository;

@Service
public class CarServiceImplementation {
	private CarsRepository carsrepository;

	public CarServiceImplementation() {

	}

	@Autowired
	public CarServiceImplementation(CarsRepository carsrepository) {
		this.carsrepository = carsrepository;
	}

	public List<Cars> carsList() {
		return carsrepository.findAll();
	}

	public Cars findById(int Id) {
		return carsrepository.findById(Id).get();
	}

	public void update(Cars cars, int Id) {

		carsrepository.save(cars);

	}

	public Cars createCar(Cars createdCar) {
		return carsrepository.save(createdCar);
	}

	public void deletedCar(int Id) {
		carsrepository.deleteById(Id);
	}
}
