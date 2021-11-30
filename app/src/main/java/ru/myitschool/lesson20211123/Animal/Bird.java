package ru.myitschool.lesson20211123.Animal;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }



    @Override
    public void move() {

    }

    @Override
    public String voice() {
        return "I am Bird! "+name;
    }
}
