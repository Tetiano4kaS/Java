package hw_2.ex_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workstation extends Laptop {
    private boolean isRAID;
    private int numberOfCores;

    public Workstation(Touchpad touchpad, boolean isRAID, int numberOfCores) {
        super(touchpad);
        this.isRAID = isRAID;
        this.numberOfCores = numberOfCores;
    }

    public Workstation(hw_2.ex_2.Monitor Monitor, Ram ram, Touchpad touchpad, boolean isRAID, int numberOfCores) {
        super(Monitor, ram, touchpad);
        this.isRAID = isRAID;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "isRAID=" + isRAID +
                ", numberOfCores=" + numberOfCores +
                "} " + super.toString();
    }
}
