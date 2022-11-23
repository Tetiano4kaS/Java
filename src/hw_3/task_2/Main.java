package hw_3.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Instrument> instrumentList=new ArrayList<>();
        instrumentList.add(new Guitar("GuitarName",6));
        instrumentList.add(new Baraban("BarabanName",30,20));
        instrumentList.add(new Truba("TrubaName",10));

        for (Instrument instrument : instrumentList) {
            instrument.play();
        }

    }
}
