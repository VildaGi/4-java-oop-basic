package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0,0 ), new Point(10, 10));

        System.out.println(line.isCollinearLine(new Point(1, 1)));
    }
}
