package exercise;

// BEGIN
public class Cottage implements Home {



    double area;
    int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    public double getArea() {
        return area;
    }
    public int getFloorCount() {
        return floorCount;
    }

    @Override
    public String toString() {
       return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }

    @Override
    public int compareTo(Home another) {
        if (another.getArea() > this.getArea()) {
            return -1;
        } else if (another.getArea() < this.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
// END
