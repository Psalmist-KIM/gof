package iterator.book;

import iterator.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookShelfIteratorTest {

    @Test
    public void iterationTest() {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Book0"));
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        Iterator iterator = bookShelf.iterator();

        for(int i = 0; iterator.hasNext(); ++i) {
            Assertions.assertEquals("Book" + i, ((Book) iterator.next()).getName());
        }
    }
}