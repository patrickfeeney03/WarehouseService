package ie.atu.warehouseservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WarehouseController {
    ArrayList<Product> storage = new ArrayList<>();

    @PostMapping("/add-product")
    public Object registerProduct(@RequestBody Product product) {
        storage.add(product);
        System.out.println("THIS RAN");
        System.out.println(product);
        return product;
    }

    @GetMapping("/get-product-by-id/{id}")
    public Object returnProduct(@PathVariable String id) {
        return new Product();
    }
}
