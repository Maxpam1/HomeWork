package Task4;

public class Main {
    public static void main(String[] args) {

        Writer writer = new Writer("Nadejda", "Ivanova");
        Writer writer1 = new Writer("Sergey", "Printov");
        Writer writer2 = new Writer("Olga", "Sokolova");
        Book book = new Book("ozero", 102, 2000, new Writer[]{writer, writer1, writer2});
        Book book1 = new Book("krai", 301, 2001, new Writer[]{writer2, writer1});
        Storage storage = new Storage(12);
        storage.addBook(book);
        storage.addBook(book1);
        System.out.println(storage);
    }
}
