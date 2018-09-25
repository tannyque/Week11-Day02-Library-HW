import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library(3);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBookToLibrary(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookToLibrary() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(3, library.bookCount());
        library.addBookToLibrary(book);
        assertEquals(3, library.bookCount());
    }
}
