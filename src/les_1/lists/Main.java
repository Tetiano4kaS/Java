package les_1.lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<String> skillsList = new ArrayList<>();
        skillsList.add("java");
        skillsList.add("js");
        skillsList.add("angular");
        User user = new User(1, "kokos", skillsList );
        System.out.println(user);

        user.getSkills().add("mysql");
        System.out.println(user);
    }
}
