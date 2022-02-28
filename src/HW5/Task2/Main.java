package HW5.Task2;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Гитара", "колличество струн", 6);
        Trumpet trumpet = new Trumpet("Труба", "размер", 100);
        Drum drum = new Drum("Барабан", "диаметр", 300);
        drum.play();
        trumpet.play();
        guitar.play();

    }
}
