package hw_3.ex_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Book(1,"title","author",Genre.THRILLER));
        printableList.add(new Magazine(2,"title","publishing"));

        for (Printable printable : printableList) {
            printable.print();

        }
    }


}
