package les_2.extnd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin extends Customer {
    private int id;
    private String name;
    private String surname;
    private Role role = Role.MANAGER;
}

