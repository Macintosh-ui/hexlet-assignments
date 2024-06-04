package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;
    double livingArea;

     Flat(double livingArea, double balconyArea, int floor) {
        this.livingArea = livingArea;
        this.balconyArea = balconyArea;
        this.floor = floor;
        this.area = livingArea + balconyArea;
    }
    public double getArea() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setLivingArea(double area, double balconyArea) {
        this.livingArea = area - balconyArea;
    }

    public double getLivingArea() {
        return livingArea;
    }

    @Override
    public int compareTo(Home another) {
        int result;
        if (another.getArea() > this.getArea()) {
            result = -1;
        } else if (another.getArea() < this.getArea()) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
    }
}
// END
