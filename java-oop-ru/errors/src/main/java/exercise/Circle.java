package exercise;

// BEGIN
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {

    }

    public int getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        double square = Math.PI * Math.pow(radius, 2);
        return Math.round(Math.round(square));
    }

    public int getRadius() {
        return radius;
    }
}
// END
