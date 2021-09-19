package Lab3.java;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        super();
    }
    public Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double r=3.14*radius*radius;
        return r;
    }

    @Override
    public double getPerimeter() {
        double r = 2*3.14*radius;
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
