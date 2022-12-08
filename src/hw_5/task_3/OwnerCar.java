package hw_5.task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerCar {
    private String name;
    private byte yearOld;
    private byte experienceOfDriving;
}
