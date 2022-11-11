package les_1;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private boolean status;
    private String[] skills;

    public User() {

    }

    public User(int id, String name, boolean status, String[] skills) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
    }

    public void setId(int id){
        this.id = id;
}

public int getId(){
        return this.id;
}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", user skills=" + Arrays.toString(skills) +
                '}';
    }
}
