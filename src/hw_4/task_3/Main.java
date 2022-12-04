package hw_4.task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Set<User> users = new HashSet<>();
//        users.add(new User(1, "vasya", "pupkin", "asd@asd.com", 31,
//                Gender.MALE,
//                Arrays.asList(new Skill("js", 10),
//                        new Skill("java", 10),
//                        new Skill("angular", 3)),
//                new Car("toyota", 2015, 250)));
//        users.add(new User(2, "kolya", "kolyanych", "asd@asd.com", 35,
//                Gender.MALE,
//                Arrays.asList(new Skill("js", 11),
//                        new Skill("java", 15)),
//                new Car("audi", 2017, 250)));
//        users.add(new User(3, "olya", "pavlovna", "asd@asd.com", 22,
//                Gender.FEMALE,
//                Arrays.asList(new Skill("js", 10),
//                        new Skill("java", 10),
//                        new Skill("angular", 3)),
//                new Car("toyota", 2015, 250)));
//        users.add(new User(4, "oksana", "pupkin", "asd@asd.com", 31,
//                Gender.FEMALE,
//                Arrays.asList(new Skill("js", 10),
//                        new Skill("java", 10),
//                        new Skill("angular", 3),
//                        new Skill("react", 3)),
//                new Car("toyota", 2015, 250)));
//        users.add(new User(5, "andrii", "pupkin", "asd@asd.com", 31,
//                Gender.MALE,
//                Arrays.asList(new Skill("js", 10),
//                        new Skill("java", 10),
//                        new Skill("angular", 3),
//                        new Skill("sql", 10),
//                        new Skill("mongodb", 5)),
//                new Car("toyota", 2015, 250)));
//        users.add(new User(6, "vasya6", "pupkin6", "asd@asd.com", 31,
//                Gender.MALE,
//                Arrays.asList(new Skill("js", 10)),
//                new Car("toyota", 2015, 250)));
//
//        Iterator<User> userIterator = users.iterator();
//        while (userIterator.hasNext()){
//            User next = userIterator.next();
//            if (next.getGender().equals(Gender.MALE)){
//                userIterator.remove();
//            }
//
//        }
//        System.out.println(users);
        Set<User> users = new TreeSet<>();
        users.add(new User(1, "vasya", "pupkin", "asd@asd.com", 31,
                Gender.MALE,
                Arrays.asList(new Skill("js", 10),
                        new Skill("java", 10),
                        new Skill("angular", 3)),
                new Car("toyota", 2015, 250)));
        users.add(new User(2, "kolya", "kolyanych", "asd@asd.com", 35,
                Gender.MALE,
                Arrays.asList(new Skill("js", 11),
                        new Skill("java", 15)),
                new Car("audi", 2017, 250)));
        users.add(new User(3, "olya", "pavlovna", "asd@asd.com", 22,
                Gender.FEMALE,
                Arrays.asList(new Skill("js", 10),
                        new Skill("java", 10),
                        new Skill("angular", 3)),
                new Car("toyota", 2015, 250)));
        users.add(new User(4, "oksana", "pupkin", "asd@asd.com", 31,
                Gender.FEMALE,
                Arrays.asList(new Skill("js", 10),
                        new Skill("java", 10),
                        new Skill("angular", 3),
                        new Skill("react", 3)),
                new Car("toyota", 2015, 250)));
        users.add(new User(5, "andrii", "pupkin", "asd@asd.com", 31,
                Gender.MALE,
                Arrays.asList(new Skill("js", 10),
                        new Skill("java", 10),
                        new Skill("angular", 3),
                        new Skill("sql", 10),
                        new Skill("mongodb", 5)),
                new Car("toyota", 2015, 250)));
        users.add(new User(6, "vasya6", "pupkin6", "asd@asd.com", 31,
                Gender.MALE,
                Arrays.asList(new Skill("js", 10)),
                new Car("toyota", 2015, 250)));


        users.stream().forEach(System.out::println);
    }
}
