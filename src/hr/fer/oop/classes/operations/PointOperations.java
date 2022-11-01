package hr.fer.oop.classes.operations;

import hr.fer.oop.classes.Point;

/**
 * PointOperations Class
 */
public class PointOperations {

    public static Point pointMostDistantFromOrigin(Point... points) {
        Point mostDistantPoint = null;
        Point origin = new Point(0, 0);
        double maxDistance = 0;
        for (var point : points) {
            double distance = point.distanceToPoint(origin);
            if (mostDistantPoint == null || distance > maxDistance) {
                mostDistantPoint = point;
                maxDistance = distance;
            }
        }
        return mostDistantPoint;
    }
}
