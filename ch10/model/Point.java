package gr.aueb.cf.ch10.model;

/**
 * defines a 2 dimension point
 */
public class Point {
    private static int numberOfPoints= 0;
private int x;
private int y;

public Point(){
    numberOfPoints++;

}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        numberOfPoints++;
    }

    public static int getNumberOfPoints() {
        return numberOfPoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

