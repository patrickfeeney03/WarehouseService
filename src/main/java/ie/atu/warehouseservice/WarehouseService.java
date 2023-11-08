package ie.atu.warehouseservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WarehouseService {
    ArrayList<Product> storage = new ArrayList<>();

    /*
    public Object registerProductService(Product product) {
        storage.add(product);
        return storage;
    }

    public Object returnSpecificProductById(int id) {
        return storage.stream().filter(product -> product.getProductId() == id).findFirst().orElse(null);
    }

     */

    @PostMapping()
    public Object getWarehouseById()
}
