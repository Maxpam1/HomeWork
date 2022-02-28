package HW5.Task3;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        Magazine magazine = new Magazine();
        Printer printer = new Printer();
        book.print();
        magazine.print();
        printer.print(magazine);

    }
}
