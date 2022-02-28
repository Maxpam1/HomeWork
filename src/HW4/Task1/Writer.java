package HW4.Task1;

public class Writer {
    private String name;
    private String surname;

    public Writer(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() <3) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.trim().length() <3 ) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
