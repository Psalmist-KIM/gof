package iterator.book;

import iterator.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            System.out.println("No Next Book exists!");
            return null;
        }

        Book book = bookShelf.getBookAt(index);
        ++index;
        return book;
    }
}
