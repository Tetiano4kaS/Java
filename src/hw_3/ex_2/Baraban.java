package hw_3.ex_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Baraban implements Instrument {
    private String name;
    private double height;
    private double width;

    @Override
    public void play() {
        System.out.println("Play " + this.name + "with characteristic: " + "height - " + this.height + "," + " width - "
                + this.width );

    }
}
