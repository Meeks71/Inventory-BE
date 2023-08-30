package com.skillstorm.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Warehouse;
import com.skillstorm.services.WarehouseService;

@RestController
@RequestMapping("/warehouses")
@CrossOrigin("*")
public class WarehouseController {

	private WarehouseService service;

	public WarehouseController(WarehouseService service) {
		super();
		this.service = service;
	}

	@GetMapping("/{Id}")
	public Warehouse getWarehouseById(@PathVariable long Id) {

		return service.getWarehouseById(Id);
	}

	@GetMapping
	public List<Warehouse> getAllWarehouses() {
		return service.getAllWarehouses();
	}

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Warehouse saveWarehouse(@RequestBody Warehouse warehouse) {
		return service.saveWarehouse(warehouse);
	}
}