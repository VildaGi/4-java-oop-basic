package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() { return p1; }
    public Point getP2() { return p2; }

    public String toString(){
        return "Line: " + p1 + ", " + p2;
    }

    public boolean isCollinearLine(Point p){
        // Три точки коллинеарны если площадь треугольника равна 0
        // Площадь треугольника = 0.5 * |(x2-x1)(y3-y1) - (x3-x1)(y2-y1)|

        double area = Math.abs(
                (p2.getX() - p1.getX())) * (p.getY() - p1.getY()) -
                (p.getX() - p1.getX())*(p2.getY() - p1.getY());
        return area < 1e-10;
    }
}
