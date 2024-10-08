package _1_WorkingWithAbstraction._2_PointInRectangle;

public class Rectangle {

    private Point a;
    private Point b;

    public Rectangle(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public boolean contains(Point p){
        return p.getX() >= a.getX() && p.getX() <= b.getX() &&
                p.getY() >= a.getY() && p.getY() <= b.getY();
    }
}
