package HW5.Task2;

public class Instruments implements Instrument {
    private String title;
    private String nameOfSpecification;
    private int specification;

    public Instruments(String title, String nameOfSpecification, int specification) {
        setTitle(title);
        setNameOfSpecification(nameOfSpecification);
        setSpecification(specification);


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.trim().equalsIgnoreCase("Гитара") || title.trim().equalsIgnoreCase("Барабан") || title.trim().equalsIgnoreCase("Труба")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("НЕ корректные данные!");
        }
    }

    public String getNameOfSpecification() {
        return nameOfSpecification;
    }

    public void setNameOfSpecification(String nameOfSpecification) {
        if (nameOfSpecification.trim().equalsIgnoreCase("диаметр") || nameOfSpecification.trim().equalsIgnoreCase("колличество струн") || nameOfSpecification.trim().equalsIgnoreCase("размер")) {
            this.nameOfSpecification = nameOfSpecification;
        } else {
            throw new IllegalArgumentException("НЕ корректные данные!");
        }

    }

    public int getSpecification() {
        return specification;
    }

    public void setSpecification(int specification) {
        if (specification == 0) {
            throw new IllegalArgumentException("НЕ корректные данные!");
        }


        this.specification = specification;
    }


    @Override
    public void play() {
        System.out.println("Инструмент: " + title + ". Характеристика: " + nameOfSpecification + ". Значение: " + specification + ".");

    }

    @Override
    public String toString() {
        return "Instruments{" +
                "title='" + title + '\'' +
                ", nameOfSpecification='" + nameOfSpecification + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
