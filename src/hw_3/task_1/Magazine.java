package hw_3.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    private int id;
    private String title;
    private String publishing;
    @Override
    public void print() {
        System.out.println(title);
    }
}
