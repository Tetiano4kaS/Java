package les_2.enums;

import lombok.Getter;
import lombok.Setter;

public enum Gender {
    MALE(true),FEMALE(false);
    @Getter
    @Setter
    private boolean pipka;
    Gender(boolean pipka){
        this.pipka = pipka;
    }
}
