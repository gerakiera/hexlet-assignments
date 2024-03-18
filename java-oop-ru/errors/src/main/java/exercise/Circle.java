package exercise;


// BEGIN
public class Circle {
    private Point point;
    private int radius;
    public Circle(Point point, int radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Радиус отцательный");
        }
        this.point = point;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getSquare() {
        return (radius * radius) * Math.PI;
    }
}
// END
