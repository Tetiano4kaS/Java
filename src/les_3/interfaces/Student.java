package les_3.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Singer{
    private String name;
    private String email;

    @Override
    public void sing() {
        System.out.println("SIng vbnjmklkjhgfd");
    }
}
