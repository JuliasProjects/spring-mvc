package web.model;

import java.util.Objects;

public class Car {
    private String name;
    private int power;
    private String color;

    public Car(String name, int power, String color) {
        this.name = name;
        this.power = power;
        this.color = color;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getPower() == car.getPower() && Objects.equals(getName(), car.getName()) && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPower(), getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
