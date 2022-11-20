package les_2.extnd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer extends User{
    private String email;

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
    @Override
    public void greeting(){
        System.out.println("hi");
    }
}
