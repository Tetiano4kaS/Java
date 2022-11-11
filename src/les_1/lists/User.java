package les_1.lists;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public User() {

    }

    public User(int id, String name, ArrayList<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
