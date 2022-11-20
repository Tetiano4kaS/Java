package hw_2.ex_4;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gend gender;
    private List<Skills> skills= new ArrayList<>();
    private Car car;
}
