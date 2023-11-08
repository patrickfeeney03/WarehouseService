package ie.atu.warehouseservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseService {
    @PostMapping("/get-product-by-id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object getWarehouseById() {
        return "asd";
    }
}
