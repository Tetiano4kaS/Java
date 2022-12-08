package hw_5.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myArray = {25, 30, 45, 12, 54, 76, 28, 50, 13, 11, 65, 88, 96, 14, 56, 89, 25, 43, 90, 71};
        Arrays.stream(myArray)
                .sorted()
                .filter(value -> value % 3 == 0)
                .filter(value -> value % 10 == 0)
                .forEach(System.out::println);

        int[] arList = Arrays.stream(myArray).map(operand -> operand * 3).toArray();
        for (int i : arList) {
            System.out.println(i);
        }
//  - Створити масив з 20 числами.
//  - за допомогою способу sorted відсортувати масив.
//  -- за допомогою filter отримати числа кратні 3
//  -- за допомогою filter отримати числа кратні 10
//  -- перебрати (проітерувати) масив за допомогою foreach()
//  -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
    }
}
