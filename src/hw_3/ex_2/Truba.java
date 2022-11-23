package hw_3.ex_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truba implements Instrument {
    private String name;
    private double radius;

    @Override
    public void play() {
        System.out.println("Play " + this.name + " with characteristic: " + "radius - " + this.radius );

    }
}
