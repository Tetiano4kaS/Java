package hw_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comments {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

}
