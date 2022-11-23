package hw_3.ex_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private String name;
    private int amountStrun;


    @Override
    public void play() {
        System.out.println("Play " + this.name + "with characteristic: " + "amount of Strun "  + this.amountStrun );
    }
}
