package HW5.Task1;

import java.util.Objects;

public class IPhone {
    private String model;
    private int weight;
    private int width;
    private int height;
    private String type;

    public IPhone(String model, int weight, int width, int height, String type) {
        setHeight(height);
        setModel(model);
        setType(type);
        setWidth(width);
        setWeight(weight);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height == 0) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight == 0) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width == 0) {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("Металл") || type.equalsIgnoreCase("Стекло")) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Не корректные данные!");

        }
        this.type = type;
    }

    public void print(IPhone iPhone) {
        System.out.println(iPhone);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "M O D E L ='" + model + '\'' +
                ", W e I g H t =" + weight +
                ", w i d t h=" + width +
                ", TYPE ='" + type + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone IPhone = (IPhone) o;
        return weight == IPhone.weight && width == IPhone.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, width);
    }
}

