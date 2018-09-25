import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

//    Declaration
    Book book;

    @Before
    public void setUp() {
        book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel");
    }

    @Test
    public void bookHasName() {
        assertEquals("The Great Gatsby", book.getTitle());
    }
}
