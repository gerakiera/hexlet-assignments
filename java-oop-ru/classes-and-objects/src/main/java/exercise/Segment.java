package exercise;

import java.awt.*;

// BEGIN
public class Segment {
    Point pointOne;
    Point pointTwo;
    public Segment(Point pointOne,Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }
    public Point getBeginPoint() {
        return pointOne;
    }
    public Point getEndPoint() {
        return pointTwo;
    }
    public Point getMidPoint() {
        int midX = (int) ((pointOne.getX() + pointTwo.getX()) / 2);
        int midY = (int) ((pointOne.getY() + pointTwo.getY()) / 2);
        return new Point(midX, midY);
    }
}
// END
