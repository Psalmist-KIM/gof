package iterator.book;

import iterator.Aggregate;
import iterator.Iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int last;

    public BookShelf() {
        this.books = new ArrayList<>();
        this.last = 0;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        ++last;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
