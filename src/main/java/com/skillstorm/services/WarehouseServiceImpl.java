
package com.skillstorm.services;

import com.skillstorm.models.Warehouse;
import com.skillstorm.repositories.WarehouseRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	private final WarehouseRepository warehouseRepository;

	public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
		this.warehouseRepository = warehouseRepository;
	}

	@Override
	public List<Warehouse> getAllWarehouses() {
		return warehouseRepository.findAll();
	}

	@Override
	public Warehouse getWarehouseById(Long id) {
		return warehouseRepository.findById(id).orElse(null);
	}

	@Override
	public Warehouse saveWarehouse(Warehouse warehouse) {
		return warehouseRepository.save(warehouse);
	}

}
