package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment() {

    }

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {

        int beginX = beginPoint.getX();
        int beginY = beginPoint.getY();
        int endX = endPoint.getX();
        int endY = endPoint.getY();
        int midX = (beginX + endX) / 2;
        int midY = (beginY + endY) / 2;
        return new Point(midX, midY);
    }
}
// END
