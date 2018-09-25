import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return books.size();
    }

    public void addBookToLibrary(Book book) {
        if (bookCount() < capacity) {
            this.books.add(book);
        }
    }
}
