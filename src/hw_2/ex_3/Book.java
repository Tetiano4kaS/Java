package hw_2.ex_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book extends Papirus{
    private int amountOfPages;
    private Cover cover;
    private Author author;
    private Genres genres;

    public Book(String producer, String material, int amountOfPages, Cover cover, Author author, Genres genres) {
        super(producer, material);
        this.amountOfPages = amountOfPages;
        this.cover = cover;
        this.author = author;
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Book{" +
                "amountOfPages=" + amountOfPages +
                ", cover=" + cover +
                ", author=" + author +
                ", genres=" + genres +
                "} " + super.toString();
    }
}
