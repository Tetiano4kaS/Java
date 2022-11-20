package hw_2.ex_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comics extends Book {
    private boolean isImage;
    private boolean isVisualInfornation;


    public Comics(String producer, String material, int amountOfPages, Cover cover, Author author, Genres genres, boolean isImage, boolean isVisualInfornation) {
        super(producer, material, amountOfPages, cover, author, genres);
        this.isImage = isImage;
        this.isVisualInfornation = isVisualInfornation;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "isImage=" + isImage +
                ", isVisualInfornation=" + isVisualInfornation +
                "} " + super.toString();
    }
}
