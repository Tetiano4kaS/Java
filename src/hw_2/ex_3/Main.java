package hw_2.ex_3;

public class Main {
    public static void main(String[] args) {
        Papirus papirus = new Papirus("sdfgh", "dfghj");

        Book book = new Book("producer", "material", 365, Cover.HARD,
                new Author("name", "surname", 35), Genres.FANTASY);

        Magazine magazine = new Magazine("producer", "material", 365, Cover.HARD,
                new Author("name", "surname", 35), Genres.FANTASY, "publishing");

        Comics comics = new Comics("producer", "material", 365, Cover.HARD,
                new Author("name", "surname", 35), Genres.FANTASY, true, true);

        System.out.println(comics);
    }
}
