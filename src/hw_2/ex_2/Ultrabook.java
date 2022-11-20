package hw_2.ex_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(Monitor Monitor, Ram ram, Touchpad touchpad, double weight) {
        super(Monitor, ram, touchpad);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
