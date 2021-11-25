package ru.myitschool.lesson20211123;

public class Point4D extends Point3D{
    float t;

    public Point4D(float x, float y, float z, float t) {
        super(x, y, z);
        this.t = t;
    }

    @Override
    public String PrintPoint() {
        return super.PrintPoint()+" "+this.t;
    }
}
