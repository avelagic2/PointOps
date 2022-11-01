package hr.fer.oop.classes;

import hr.fer.oop.classes.operations.PointOperations;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(2.0, 4.5);
        Point p2 = new Point(-1.0, -4.5);
        double distance = p1.distanceToPoint(p2);
        //System.out.println(distance);
        Point p3 = new Point(5, 7);
        Point p = PointOperations.pointMostDistantFromOrigin(
                p1, p2, p3, new Point(3, 6), new Point(1, 2));
        System.out.println(p.toString());
        System.out.println(p.equals(p3));
        System.out.println(p == p3); //returned the real point p3

    }

}