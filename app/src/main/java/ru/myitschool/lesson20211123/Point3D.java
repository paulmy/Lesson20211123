package ru.myitschool.lesson20211123;

public class Point3D extends Point {
    float z;

    public Point3D(float x, float y, float z) {
        super(x, y);//Вызов базового конструктора класса Point
        this.z = z;
    }

    @Override
    public String PrintPoint() {
        return super.PrintPoint()+" " +this.z;
    }
}
