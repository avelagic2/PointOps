package hr.fer.oop.classes;

/**
 * FER UNIZG OOP - ETF UNSA RPR
 * Project modification
 *
 * @author Abdulhadi Velagic
 */

/**
 * Point class
 */

public class Point {
    private double x, y;


    /**
     * Getter and setter for x and y
     * @return returns ands sets values of x and y
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Regular constructor
     * @param x defines value of x
     * @param y defines value of y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Chained constructor
     * @param p sets value of p with two coordinates using before declared constructor
     */
    public Point(Point p) {
        this(p.x, p.y);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        Point other = (Point) obj;
        return Math.abs(x - other.x) < 1E-8
                &&
                Math.abs(y - other.y) < 1E-8;
    }

    /**
     *
     * @param p enter value of a random point
     * @return returns Euclidian distance between two points
     */
    public double distanceToPoint(Point p) {
        return Math.sqrt(Math.pow(this.y - p.getY(), 2) + Math.pow(this.x - p.getX(), 2));
    }

}