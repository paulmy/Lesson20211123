package ru.myitschool.lesson20211123.Animal;

public class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void move() {

    }

    @Override
    public String voice() {
        if (age < 10)
            return "тяф тяф";
        else if (age < 20) {
            return "Гав Гав";
        }
        return "ГАВ ГАВ";
    }
}
