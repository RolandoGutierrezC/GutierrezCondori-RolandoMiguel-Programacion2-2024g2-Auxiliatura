import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        Author author = new Author("John Doe");

        author.addBook("Book One", 20.0);
        author.addBook(new Book("Book Two", author, 25.0));
        List<Book> books = author.getBooks();
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }
}
