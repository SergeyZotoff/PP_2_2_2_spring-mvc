package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String number;
    private int yop;




    public Car(String name, String number, int yop) {
        this.name = name;
        this.number = number;
        this.yop = yop;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", yop=" + yop +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }
}

