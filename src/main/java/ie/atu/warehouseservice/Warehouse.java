package ie.atu.warehouseservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {
    private int warehouseId;
    private String location;
    private int capacity;
}
