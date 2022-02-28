package HW4.Task1;

import java.util.Arrays;

public class Book {
    private String name;
    private int pages;
    private int age;
    private Writer[] writers;

    public Book(String name, int pages, int age, Writer[] writers) {
        setName(name);
        setAge(age);
        setPages(pages);
        setWriters(writers);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length()<3) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.pages = pages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 2022 || age ==0) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.age = age;
    }

    public Writer[] getWriters() {
        return writers;
    }

    public void setWriters(Writer[] writers) {
        this.writers = writers;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", age=" + age +
                ", writers=" + Arrays.toString(writers) +
                '}';
    }
}

