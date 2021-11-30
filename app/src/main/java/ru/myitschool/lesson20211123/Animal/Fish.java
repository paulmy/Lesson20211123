package ru.myitschool.lesson20211123.Animal;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }



    @Override
    public void move() {

    }

    @Override
    public String voice()  {
        return "I am Fish" + name;
    }
}
