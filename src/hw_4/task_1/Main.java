package hw_4.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("olya", 20));
        users.add(new User("kolya", 23));
        users.add(new User("polya", 34));
        users.add(new User("volya", 25));
        users.add(new User("valera", 18));
        users.add(new User("galya", 29));

        users.sort((u1, u2)-> u1.getAge()- u2.getAge());
        users.sort((u1, u2)-> u2.getAge()- u1.getAge());


    }
}
