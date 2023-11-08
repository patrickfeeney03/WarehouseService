package ie.atu.warehouseservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    ArrayList<Warehouse> warehouse_storage = new ArrayList<>();

    public void addWarehouse(Warehouse warehouse) {
        warehouse_storage.add(warehouse);
    }

    public Warehouse getWarehouseById(int id) {
        return warehouse_storage.stream().
                filter(wh -> wh.getWarehouseId() == id).
                findFirst().
                orElse(null);
    }
}
