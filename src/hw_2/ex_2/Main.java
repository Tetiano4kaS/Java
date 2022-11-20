package hw_2.ex_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(new Monitor("fgh","dfgh"),
                new Ram(Type.DDR4,"fghjkl"));

        Laptop laptop = new Laptop(new Monitor("fgh", "dfgh"),
                new Ram(Type.DDR4, "fghjkl"),
                new Touchpad("fghjkl", "dfghjkl"));

        Ultrabook ultrabook = new Ultrabook(
                new Monitor("fgh", "dfgh"),
                new Ram(Type.DDR4, "fghjkl"),
                new Touchpad("fghjkl", "dfghjkl"),
                1.2);

        Workstation workstation = new Workstation(
                new Monitor("dfghj","dfghj"),
                new Ram(Type.DDR4,"fghj"),
                new Touchpad("fghj","dfghj"),
                true,32);

        System.out.println(workstation);
    }
}
