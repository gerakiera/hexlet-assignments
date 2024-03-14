package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public String toString() {
        return "Квартира площадью " +
                getArea() +
                " метров на " +
                floor +
                " этаже";
    }
    @Override
    public int compareTo(Flat flat) {
        if (area > flat.getArea()) {
            return 1;
        }
        if (area == flat.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}
// END
