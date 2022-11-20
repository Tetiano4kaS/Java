package hw_2.ex_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        User user = new User(1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gend.MALE,
                Arrays.asList(new Skills("java",10),
                        new Skills("js",12),
                        new Skills("fghjkl",10)),
                new Car("toyota",2004,250));
        System.out.println(user);
    }
}
