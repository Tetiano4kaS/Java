package hw_2.ex_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine extends Book{
    private String publishing;


    public Magazine(String producer, String material, int amountOfPages, Cover cover, Author author, Genres genres, String publishing) {
        super(producer, material, amountOfPages, cover, author, genres);
        this.publishing = publishing;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "publishing='" + publishing + '\'' +
                "} " + super.toString();
    }
}
