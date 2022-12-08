package hw_5.task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private int power;
    private OwnerCar ownerCar;
    private double price;
    private int yearProduce;
    private boolean engineRenovation;
}
