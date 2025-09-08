package com.example.task04;

/**
 * Класс точки на плоскости
 */
public class Point {
    final private int X;
    final private int Y;
    public int getX() { return X; }
    public int getY() { return Y; }

    Point(){
        X = 0;
        Y = 0;
    }
    Point(int x, int y){
        this.X = x;
        this.Y = y;
    }

    void print() {
        String pointToString = String.format("(%d, %d)", X, Y);
        System.out.println(pointToString);
    }

    public String toString(){
        return String.format("(%d, %d)", X, Y);
    }

    Point flip(){
        return new Point(-Y, -X);
    }

    double distance(Point point){
        return Math.sqrt(Math.pow(point.X - X, 2) + Math.pow(point.Y - Y, 2));
    }
}
