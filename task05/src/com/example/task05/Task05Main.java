package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2),
                new Point(4, 6)
        };
        PolygonalLine line = new PolygonalLine();
        line.setPoints(points);
        final double expected = line.getLength();

        System.out.println(expected);

        Point[] points2 = {
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16),
        };
        PolygonalLine line2 = new PolygonalLine();
        for (Point p : points) {
            line2.addPoint(p);
        }
        final double expected2 = line.getLength();

        System.out.println(expected2);

    }
}
