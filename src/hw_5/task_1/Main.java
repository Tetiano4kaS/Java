package hw_5.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//  створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//  *-- відфільтрувати слова довжиною менше 5 символів
        List<String> words = new ArrayList<>();
        words.add("catch");
        words.add("charge");
        words.add("development");
        words.add("keep");
        words.add("magazine");
        words.add("nothing");
        words.add("office");
        words.add("performance");
        words.add("plant");
        words.add("thousand");
        words.add("discussion");
        words.add("general");
        words.add("glass");
        words.add("happy");
        words.add("allow");

//        words.sort((o1, o2) -> o1.compareTo(o2));

//        words.stream()
//                .filter(s -> s.length()<=5)
//                .forEach(System.out::println);

//        List<String> wordOfList = words.stream()
//                .filter(s -> s.length() <= 5)
//                .collect(Collectors.toList());
//        System.out.println(wordOfList);
    }
}
