package hw_4.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> listNames  = Arrays.asList("vasya", "kolya", "petya", "olya", "stefan","andrii", "mychaylo",
                "serhii", "julia", "oksana", "vlad", "katarzyna", "justyna", "magda", "iryna");
        listNames.sort(Comparator.naturalOrder());

        System.out.println(listNames);

    }
}
