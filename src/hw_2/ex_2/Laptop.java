package hw_2.ex_2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Laptop extends PC{
private Touchpad touchpad;

    public Laptop(hw_2.ex_2.Monitor Monitor, Ram ram, Touchpad touchpad) {
        super(Monitor, ram);
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad=" + touchpad +
                "} " + super.toString();
    }
}
