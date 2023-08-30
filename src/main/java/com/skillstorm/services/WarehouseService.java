package com.skillstorm.services;



import com.skillstorm.models.Warehouse;

import java.util.List;

public interface WarehouseService {

    List<Warehouse> getAllWarehouses();

    Warehouse getWarehouseById(Long id);

    Warehouse saveWarehouse(Warehouse warehouse);

    // Add other methods as needed
}
