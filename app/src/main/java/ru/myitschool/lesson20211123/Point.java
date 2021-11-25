package ru.myitschool.lesson20211123;

public class Point {
    float x;
    float y;
    int color;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float x, float y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String PrintPoint() {
        return this.x + " " + this.y;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
