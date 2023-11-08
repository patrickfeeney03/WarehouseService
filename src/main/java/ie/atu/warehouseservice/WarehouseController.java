package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WarehouseController {
    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    ArrayList<Product> storage = new ArrayList<>();

    @PostMapping("/add-product")
    public Object registerProduct(@RequestBody Product product) {
        storage.add(product);
        return storage;
    }

    @GetMapping("/get-product-by-id/{id}")
    public Object returnProduct(@PathVariable String id) {
        return storage.stream().filter(product -> product.getProductId() == Integer.parseInt(id)).findFirst().orElse(null);
    }
}
