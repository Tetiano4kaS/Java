package hw_3.ex_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable{
    private int id;
    private String title;
    private String author;
    private Genre genre;

    @Override
    public void print() {
        System.out.println(this);
    }
}
