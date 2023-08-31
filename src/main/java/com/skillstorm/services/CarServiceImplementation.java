package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Cars;
import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.CarsRepository;
import com.skillstorm.repositories.WarehouseRepository;

@Service
public class CarServiceImplementation {
	private CarsRepository carsrepository;
	private WarehouseRepository warehouserepo;

	public CarServiceImplementation() {

	}

	@Autowired
	public CarServiceImplementation(CarsRepository carsrepository, WarehouseRepository warehouserepo) {
		this.carsrepository = carsrepository;
		this.warehouserepo = warehouserepo;
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
		Warehouse warehouse = createdCar.getWarehouse();
		if (warehouse != null && warehouse.getId() != 0 && warehouserepo.existsById(warehouse.getId()))
			return carsrepository.save(createdCar);
		else
			return null;
	}

	public void deletedCar(int Id) {
		carsrepository.deleteById(Id);
	}
}
