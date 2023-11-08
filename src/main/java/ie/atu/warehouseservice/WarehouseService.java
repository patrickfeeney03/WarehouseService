package ie.atu.warehouseservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    ArrayList<Warehouse> warehouses = new ArrayList<>();

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public Warehouse getWarehouseById(int id) {
        return warehouses.stream().filter(wh -> wh.getWarehouseId() == id).findFirst().orElse(null);
    }
}
