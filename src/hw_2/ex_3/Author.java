package hw_2.ex_3;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    private String name;
    private String surname;
    private int yearsOld;
}
