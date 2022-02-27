package Task4;

import java.util.Arrays;

public class Storage {
    private int size;
    private Book[] books = new Book[19];

    public Storage(int sizeofStorage) {
        if (sizeofStorage > 20) {
            throw new IllegalArgumentException("не корректные данные!");
        } else {
            this.size = size;
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "size=" + size +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) {
                books[i] = book;
                return;
            }

        }

    }
}
