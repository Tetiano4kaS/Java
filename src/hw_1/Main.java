package hw_1;

public class Main {
    public static void main(String[] args) {

        String title = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";

        String body = "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto";

        Post post = new Post(1, 1, title, body);
        System.out.println(post);

        String name = "id labore ex et quam laborum";
        String email = "Eliseo@gardner.biz";
        String commentsBody = "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium";
        Comments comments = new Comments(1, 1, name, email, commentsBody);
        System.out.println(comments);
    }
}
